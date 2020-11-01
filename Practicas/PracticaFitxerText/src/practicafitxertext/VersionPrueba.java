/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafitxertext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author sorwarhussian
 */
public class VersionPrueba {

    public static void main(String[] args) throws IOException {

        Scanner lectura;

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
            String paraula = null;
            try {
                Scanner entrada = new Scanner(fitxerEntrada);
                paraula = entrada.next();
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
                    PrintWriter pw = new PrintWriter(new FileWriter(fitxerSortida, true));

                    // saltos de linias 
                    BufferedReader br = new BufferedReader(new FileReader("practica.txt"));
                    String line = null;
                    //fin salto de linias 

                    while (fitxerEntrada.hasNextLine()) {

                        //System.out.println(tabulador(lectura.next()+"*"));
//                String espacios=tabulador(lectura.nextLine()+"");
                        pw.write(leer(lectura.nextLine()));

                        if (br.readLine() != null) {
                            pw.write("\n");
                        }

                    }

                    pw.close();
                } catch (IOException e) {
                    System.out.println("Problemes d'E/S");
                }
            }
        }

        //selecionar ficher 
        //codigo no tocar !!!
        File fichero = new File("practica.txt");

        try {
            lectura = new Scanner(fichero);
            PrintWriter pw = new PrintWriter("salidaPractica.txt");

            // saltos de linias 
            BufferedReader br = new BufferedReader(new FileReader("practica.txt"));
            String line = null;
            //fin salto de linias 

            while (lectura.hasNextLine()) {

                //System.out.println(tabulador(lectura.next()+"*"));
//                String espacios=tabulador(lectura.nextLine()+"");
                pw.write(leer(lectura.nextLine()));

                if (br.readLine() != null) {
                    pw.write("\n");
                }

            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    /**
     * Funcion que recibe una palabra y obtiene otro con la característica
     * ejemplificada anteriormente, es decir, manteniendo la primera y la última
     * letra de cada palabra y mezclando las del medio.
     *
     * @param s
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
