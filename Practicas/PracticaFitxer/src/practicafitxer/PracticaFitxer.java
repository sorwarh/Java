package practicafitxer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Es un programa que fa el següent, Llegir un fitxer de text i obtenir-ne un
 * altre amb la característica exemplificada anteriorment, és a dir, mantenint
 * la primera i l’última lletra de cada paraula i barrejant les del mig. Es
 * mante la rostre del fitxer original, (salts de linia, espais en blanc i
 * tabuladors). Una paraula que conte numero no es barreja. Es recmena l'us de
 * JFileChooser per escollir el fitxer tan per guardar com per demanar el
 * fitxer.
 *
 * @author Sorwar Hussian T.B
 * @version 27 may 2019
 *
 */
public class PracticaFitxer {

    public static void main(String[] args) {

        String nativeLF = UIManager.getSystemLookAndFeelClassName();
        try {

            UIManager.setLookAndFeel(nativeLF);
        } catch (Exception e) {
        }

        JFileChooser selector = new JFileChooser();

        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int ok = selector.showOpenDialog(null);

        if (ok != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "Adéu. Fins una altra vegada");
        } else {
            File fitxerEntrada = selector.getSelectedFile();

            try {
                Scanner entrada = new Scanner(fitxerEntrada);
                entrada.close();
            } catch (FileNotFoundException e) {
                System.out.println("Fitxer no trobat");
            }

            JFileChooser selector2 = new JFileChooser();
            int ok2 = selector2.showSaveDialog(null);
            if (ok2 != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "Adéu. Fins una altra vegada");
            } else {
                File fitxerSortida = selector2.getSelectedFile();
                try {

                    PrintWriter pw = new PrintWriter(fitxerSortida);
                    Scanner lectura = new Scanner(fitxerEntrada, "iso-8859-1");
                    //PrintWriter pw = new PrintWriter("salidaPractica.txt");

                    // saltos de linias 
                    String line;
                    while (lectura.hasNextLine()) {

                        line = lectura.nextLine();
                        /*llamada a la funcio leer, li passem una liniea i en retorna la liniea barrejada */
                        line = leer(line);
                        /*Llamada a la funcio tabulador, que retorn un  String amb els
                            espais que hi ha entre l'inici i la primera paraula // */
                        //funcio tabulador no acaba de funcionar aqui 
                        // String tab=tabulador(lectura.nextLine()+"");
                        //pw.println(tab+line);
                        pw.println(line);

                    }
                    pw.close();
                } catch (IOException e) {
                    System.out.println("Problemes d'E/S");
                }
            }
        }
    }

    /**
     * Funcio que reb una paraula, deixa igual el primer i l'ultim caracter, i
     * els caracters del mig els barreja. Si una paraula conte un numero no la
     * barreja.
     *
     * @param paraulaEntrada
     * @return paraulaSortida
     */
    public static String barrejarParaula(String paraulaEntrada) {

        String paraulaSortida;
        if (paraulaEntrada.length() > 3 && !filtrarNumerosPalabra(paraulaEntrada)) {

            int primerChar = posInici(paraulaEntrada); // primerChar, llamada  ala barrejarParaula posInici que retorna un integer que guarda la primera  posicion del string recibido 

            /**
             * ultimoChar, llamada a la funcion posFinal que retorna un integer
             * que guarda la ultima posicion del string recibido , despues puede
             * contener caracteres (comas,puntos...)
             */
            int ultimoChar = posFinal(paraulaEntrada);

            //palabra=paraulaEntrada.subSequence(0, primerChar)+"";
            paraulaSortida = paraulaEntrada.charAt(primerChar) + ""; // al String paraulaSortida le anadimos el primer caracter la posicion primerChar del String recibido . 

            //Utilizamos una String auxiliar para tener el substring de la primerChar hasta ultimoChar
            String caracteresParaRandom = paraulaEntrada.substring(primerChar + 1, ultimoChar);
            char[] auxArray = caracteresParaRandom.toCharArray();//creamos un auxiliar  auxArray, para que el random no tenga valores repetitivos 

            int i = 0;//indice que empieza a la posicion 0 del auxiliar auxArray 

            while (auxArray.length > i) { // bucle para hacer el random y rellenar con caracteres del array auxiliar //

                int n = (int) (Math.random() * auxArray.length);
                //asseguar que no se repitan los caracteres
                if (auxArray[n] != '±') {
                    paraulaSortida += auxArray[n] + "";
                    auxArray[n] = '±';
                    i++;
                }

            }
            //Acabar de concatenar la palbra final con los ultimos caracteres, que pueden ser puntos, comas, etz...
            paraulaSortida += paraulaEntrada.substring(ultimoChar, paraulaEntrada.length());
        } else {
            paraulaSortida = paraulaEntrada;

        }
        return paraulaSortida;

    }

    /**
     * Funcio booleana que reb una paraula i comprova si conte un numero retorna
     * true i si no false.
     *
     * @param paraula
     * @return conteNumero
     */
    public static boolean filtrarNumerosPalabra(String paraula) {
        boolean conteNumero = false;
        paraula = paraula.toLowerCase();
        for (int i = 0; i < paraula.length() && !conteNumero; i++) {

            if (paraula.charAt(i) >= '0' && paraula.charAt(i) <= '9') {
                conteNumero = true;
            }

        }
        return conteNumero;
    }

    public static int posInici(String s) {
        s = s.toUpperCase();
        int i = 0;

        while (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && i < s.length()) {

            i++;

        }
        return i;

    }

    public static int posFinal(String s) {

        s = s.toUpperCase();
        int i = s.length() - 1;

        while (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && i > 0) {

            i--;

        }
        return i;

    }

    /**
     * funcio que reb una linea i es guarda les paraules separades amb un espai
     * " " (split), en una array de String
     *
     * @param linea
     * @return l , retorna la nova linea amb les paraules barrejades
     */
    public static String leer(String linea) {
        String l = "";
        String[] p = linea.split(" ");

        for (String p1 : p) {
            String a = barrejarParaula(p1);
            l += (a + " ");
        }

        return l;

    }

    /**
     * Funcio que reb una linea i clcula cuants espais en blanc te al principi.
     *
     * @param linea
     * @return tab , espais en blancs al principi de una linia
     */
    public static String tabulador(String linea) {
        String tab = "";
        boolean salir = false;
        for (int i = 0; i < linea.charAt(i) && !salir; i++) {

            if (linea.charAt(i) == ' ') {
                tab += " ";

            } else {
                salir = true;
            }

        }

        return tab;
    }
}
