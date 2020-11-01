package practicafitxertext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class PractivaVFinal {

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
            //String lectura = null;
            try {
                Scanner entrada = new Scanner(fitxerEntrada);
//                lectura = entrada.nextLine();
//                System.out.println("Primera paraula=" + lectura);
                //ETC
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
                    /* El constructor de FileWriter amb true fa APPEND al fitxer, no "matxaca" */
                    PrintWriter pw = new PrintWriter(fitxerSortida);
                    Scanner lectura = new Scanner(fitxerEntrada, "iso-8859-1");
                    //PrintWriter pw = new PrintWriter("salidaPractica.txt");

                    // saltos de linias 
                    BufferedReader br = new BufferedReader(new FileReader(fitxerEntrada));
                    String line;
                    while (lectura.hasNextLine()) {
                        // String espacios=tabulador(lectura.nextLine()+"");
                        line = lectura.nextLine();
                        line = leer(line);
                        pw.println(line);
//                        pw.write(leer(lectura.nextLine()));

//                        if (br.readLine() != null) {
//                            pw.write("\n");
//                        }
                    }
                    pw.close();
                } catch (IOException e) {
                    System.out.println("Problemes d'E/S");
                }
            }
        }
    }

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
     *
     * @param linea
     * @return l
     */
    public static String leer(String linea) {
        String l = "";
//        int tab=tabulador(linea);
//        
//        for (int i = 0; i < tab; i++) {
//            l+=" ";
//            
//        }

        String[] p = linea.split(" ");

        for (String p1 : p) {
            String a = funcion(p1);
            l += (a + " ");
        }

        return l;

    }

    public static String tabulador(String l) {
        String tab = "";
        boolean salir = false;
        for (int i = 0; i < l.charAt(i) && !salir; i++) {

            if (l.charAt(i) == ' ') {
                tab += " ";

            } else {
                salir = true;
            }

        }

        return tab;
    }
}
