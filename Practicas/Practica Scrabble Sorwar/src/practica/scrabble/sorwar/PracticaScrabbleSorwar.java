package practica.scrabble.sorwar;

import java.io.FileNotFoundException;
import java.util.Scanner;
import static scrabble.ProvesFitxers.llegirParaules;

/** Programa en Java que permet jugar a una variant simplificada de l’Scrabble.
 * @author sorwarhussian
 * @version 4/4/2019
 */
public class PracticaScrabbleSorwar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean exit = false;
        int puntsObtinguts, ronda;
        char[]lletres={};
        String[] diccionari = fDiccionari();

        do {
            int opcio = menuPrincipal();

            if (opcio == 3) {
                exit = true;
            } else {
                if (opcio == 1) {
                    ronda = 5;
                    while (ronda > 0) {
                        
                        System.out.println("...........................................\n***Tens " + ronda + " ronda ***");
                        lletres=generarArrayLletres();
                        jugarUsuari(diccionari,lletres);
                        ronda--;
                    }
                } else if (opcio == 2) {
                    ronda = 10;
                    while (ronda > 0) {
                        System.out.println("...........................................\n***Tens " + ronda + " ronda ***");
                        lletres=generarArrayLletres();
                        String paraulaMaquina = millorParaula(diccionari, lletres);
                        int puntsMaquina = calcularPuntuacio(paraulaMaquina);
                        System.out.println("Paraula mquina: " + paraulaMaquina + " && Punts=" + puntsMaquina);
                        jugarUsuari(diccionari,lletres);

                        ronda--;
                    }

                }

            }
            if (!exit) {
                System.out.println("--------JOC FINALITZAT----------");
            }

        } while (!exit);

        if (exit) {
            System.out.println("----HAS SORTIR DEL JOC---- ");
        }

    }

    /** Funcio que genera un diccionari 
     */
    public static String[] fDiccionari() {

        //Buscar al diccionari si existeix la paraula que ha introduit l'usuari. 
        String nomFitxerESP = "words.txt";
        String[] paraules = {};

        try {
            paraules = llegirParaules(nomFitxerESP);

        } catch (FileNotFoundException e) {
        }
        return paraules;

    }

   /** Funcio que deman el usuari la partido que vol jugar
     */
    public static int menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        int opcio;
        System.out.println("-------------------------------");
        System.out.println("*            M E N U          *");
        System.out.println("-------------------------------");
        
        do {
            System.out.println("OPCIO 1: Partida Individual  \nOPCIO 2: Partida amb l'ordenador \nOPCIO 3: Sortir del joc");
            opcio = entrada.nextInt();

            if (opcio > 3) {
                System.out.println("<<<<<<<<<ERROR>>>>>>>>>");
            }
        } while (!(opcio == 1 || opcio == 2 || opcio == 3));
        return opcio;
    }
    
    /**Funcio void per la partida de l'usuari. Donat el diccionari i  les lletres, el usuari introdueix una paraula i la funcio
     * primer comproba que la paraula es pogui formar amb les lletres, despres busca la paraula en el diccionari, en cas de 
     * que la paraula existeixi calcula la seva puntuacio obtinguda(casa lletra es puntua de manera diferent)
     * @param diccionari(diccionari de paraules)
     * @param lletres (array de 7 lletres aleatoris (3 vocals y 4 consonants))
     */
    public static void  jugarUsuari(String[] diccionari,char[]lletres) {
        Scanner entrada = new Scanner(System.in);
        String paraula = "";
        System.out.println("Introdueix la paraula :  ");
        paraula = entrada.next().toUpperCase();
        if (partidaUsuari( paraula, lletres)) {
            System.out.println("Existeix la paraula i has obtingut: " + calcularPuntuacio(paraula) + " punts");
        } else {
            if (!(estaEnDiccionari(diccionari, paraula))) {
                System.out.println("No trobat en el diccionari");
            }
        }
    }

    /** Funcio que genera 7 lletres aleatories. 3 vocals i 4 consonants. 
     *  vocales String que conte tots els vocals 
     * consonants String que conte tots els consonants 
     * arrayLletres array de char que conte 7 caracters 
     * arrayLletres (les 7 lletres es pasen en el arrayLletres)
     */
    public static char[] generarArrayLletres() {
        String vocales = "AEIOU";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
        char[] arrayLletres = new char[7];
        for (int i = 0; i < arrayLletres.length; i++) {
            if (i < 3) {
                arrayLletres[i] = vocales.charAt((int) (Math.random() * vocales.length()));
            } else {
                arrayLletres[i] = consonants.charAt((int) (Math.random() * consonants.length()));
            }
        }
        System.out.print("Lletres generades: ");
        for (int i = 0; i < arrayLletres.length; i++) {
            System.out.print(arrayLletres[i] + " ");
        }
        System.out.println("");
        return arrayLletres;
    }
    
    /** Funcio booleana. Donat diccionari,una paraula i un array de lletres comprova que la paraula es pogui formar amb l'array de lletre,
     * despres busca si aquesta paraula eixisteix en el diccionari.  
     * @param paraula String introduida per l'usuari
     * @param lletres Array de char que conte 7 caracters 
     * paraulaTrobat boolean que comprova si la paraula hi es en el diccionari
     * comprovaParaula boolean busca en una funcio si la paraula es pot formar amb les lletres
     *  paraulaTrobat
     */
    public static boolean partidaUsuari( String paraula, char[] lletres) {
        boolean paraulaTrobat = false;
        boolean comprovaParaula = paraulaValida(paraula, lletres);
        System.out.println(comprovaParaula ? "" : "Paraula NO valida");
        if (comprovaParaula) {
            //Buscar al diccionari si existeix la paraula que ha introduit l'usuari. 
            String nomFitxerESP = "words.txt";
            String[] paraules;
            try {
                paraules = llegirParaules(nomFitxerESP);
                paraulaTrobat = (estaEnDiccionari(paraules, paraula));
            } catch (FileNotFoundException e) {
            }
        } else {
            paraulaTrobat = false;
        }
        return paraulaTrobat;
    }
    
    /**Aquesta funcio comprova que la persona qui juga proposa una paraula que es pugui formar amb aquestes lletres.
     * @param paraula String introduida per l'usuari
     * @param lletres array de char que conte 7 elements
     * auxLletres copia de lletres en un array auxiliar perque no es modifique el array original
     * paraulaValida Boolean 
     * paraulaValida
     */

    public static boolean paraulaValida(String paraula, char[] lletres) {
        char[] auxLletres = new char[lletres.length];

        for (int i = 0; i < auxLletres.length; i++) {
            auxLletres[i] = lletres[i];
        }
        
        boolean paraulaValida = true;

        if (paraula.length() > auxLletres.length) {
            paraulaValida = false;
        } else {

            for (int i = 0; i < paraula.length() && paraulaValida; i++) {

                boolean ok = false;
                int j = 0;
                while (j < auxLletres.length && !ok) {
                    if (paraula.charAt(i) == auxLletres[j]) {
                        ok = true;
                        auxLletres[j] = '.';
                    } else {
                        j++;
                        if (j == auxLletres.length) {
                            paraulaValida = false;
                        }
                    }
                }

            }
        }

        return paraulaValida;
    }

    /**Funcio booleana: donat un diccionari de paraules i una paraula, busca si la paraula pertany en el diccionari.
     * @param diccionari Array de String que conte paraules 
     * @param paraula String introduida per l'usuari
     * trobat boolean que es retorna si la paraula existeix en el diccionari 
     */
    public static boolean estaEnDiccionari(String[] diccionari, String paraula) {
        boolean trobat = false;
        for (int i = 0; i < diccionari.length && !trobat; i++) {
            if (diccionari[i].equals(paraula)) {
                trobat = true;
            }
        }
        return trobat;
    }

    /**Funcio integer, donat una paraula calcula la puntuacio obtinguda. 
     * @param paraula String introduida per l'usuari
     */
    public static int calcularPuntuacio(String paraula) {
        int punt = 0;
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.length() == 7) {
                punt = 50;
            } else {

                switch (paraula.charAt(i)) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'N':
                    case 'R':
                    case 'T':
                    case 'L':
                    case 'S':
                    case 'U':
                        punt += 1;
                        break;
                    case 'D':
                    case 'G':
                        punt += 2;
                        break;
                    case 'B':
                    case 'C':
                    case 'M':
                    case 'P':
                        punt += 3;
                        break;
                    case 'F':
                    case 'H':
                    case 'V':
                    case 'W':
                        punt += 4;
                        break;
                    case 'K':
                        punt += 5;
                        break;
                    case 'J':
                    case 'X':
                        punt += 8;
                        break;
                    default:
                        punt += 10;
                        break;
                }

            }
        }
        return punt;
    }

    
    /**Donat les lletres i un diccionari, la funcio busca la paraula que os pogui formar amb les lletres i que obtingui la maxima puntiacio.
     * @param diccionari Array de String que conte paraules 
     * @param lletres Array de char que conte 7 elements 
     * @return millorParaula String que pertany al diccionari 
     */
    public static String millorParaula(String[] diccionari, char[] lletres) {
        //la primera paraula del diccionari vàlida
        int i = 0;
        while (!(paraulaValida(diccionari[i], lletres)) && i < diccionari.length - 1) {
            i++;
        }
        int millorPuntuacio = calcularPuntuacio(diccionari[i]);
        String millorParaula = diccionari[i];
        // Seguir amb la resta de paraules
        for (; i < diccionari.length; i++) {
            if (paraulaValida(diccionari[i], lletres)) {
                int auxPuntuacio = calcularPuntuacio(diccionari[i]);
                if (auxPuntuacio > millorPuntuacio) {
                    millorPuntuacio = auxPuntuacio;
                    millorParaula = diccionari[i];
                }
            }

        }
        return millorParaula;
    }

}
