package practicafitxertext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class PracticaFitxerText {

    public static void main(String[] args) {
        Scanner lectura;

        File fichero = new File("practica.txt");

        try {

            lectura = new Scanner(fichero);
            try (PrintWriter pw = new PrintWriter("salidaPractica.txt")) {

                while (lectura.hasNextLine()) {
                    pw.write(leer(lectura.nextLine()));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    /**
     * Funcion que recibe una palabra y obtiene otro con la característica
     * ejemplificada anteriormente, es decir, manteniendo la primera y la última
     * letra de cada palabra y mezclando las del medio.
     *
     * @param s String , palabra
     * @return palabra
     */
    public static String funcion(String s) {

        String palabra;
        if (s.length() > 3 && !filtrarNumerosPalabra(s)) {

            int primerChar = posInici(s); // primerChar, llamada  ala funcion posInici que retorna un integer que guarda la primera  posicion del string recibido 

            /**
             * ultimoChar, llamada a la funcion posFinal que retorna un integer
             * que guarda la ultima posicion del string recibido , despues puede
             * contener caracteres (comas,puntos...)
             */
            int ultimoChar = posFinal(s);
            //palabra=s.subSequence(0, primerChar)+"";
            palabra = s.charAt(primerChar) + ""; // al String palabra le anadimos el primer caracter la posicion primerChar del String recibido . 

            //Utilizamos una String auxiliar para tener el substring de la primerChar hasta ultimoChar
            String caracteresParaRandom = s.substring(primerChar + 1, ultimoChar);
            char[] auxArray = caracteresParaRandom.toCharArray();//creamos un auxiliar  auxArray, para que el random no tenga valores repetitivos 

            int i = 0;//indice que empieza a la posicion 0 del auxiliar auxArray 

            while (auxArray.length > i) { // bucle para hacer el random y rellenar con caracteres del array auxiliar //

                int n = (int) (Math.random() * auxArray.length);
                //asseguar que no se repitan los caracteres
                if (auxArray[n] != '±') {
                    palabra += auxArray[n] + "";
                    auxArray[n] = '±';
                    i++;
                }

            }
            //Acabar de concatenar la palbra final con los ultimos caracteres, que pueden ser puntos, comas, etz...
            palabra += s.substring(ultimoChar, s.length());
        } else {
            palabra = s;

        }
        return palabra;

    }

    public static boolean filtrarNumerosPalabra(String s) {
        boolean contieneNum = false;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() && !contieneNum; i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                contieneNum = true;
            }

        }
        return contieneNum;
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
     * Funcion que recibe una linia, uso de split para crear un array de string
     * con todas las palabas separadas por el espacio. Tenieno el array, hacemos
     * un bucle para recorrer todas las palabras, a cada una de la palabra
     * llamamos a la funcion para mezclar los caracteres y nos retorna una
     * palabra que la vamos concatenando a lineaFinal,y tambien va concatentando
     * si hay saltos de linia, epacio, caracteres especiales como (,!?...)
     *
     * @param linea
     * @return lineaFinal
     */
    public static String leer(String linea) {
        String lineaFinal = "";
        String[] arrayPalabras = linea.split(" ");
        for (String p1 : arrayPalabras) {
            String a = funcion(p1);
            lineaFinal += (a + " ");
        }
        lineaFinal += ("\n");

        return lineaFinal;

    }

}
