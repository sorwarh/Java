/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafitxertext;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class prova {

    public static void main(String[] args) {

        Scanner lectura;
        File fichero = new File("prova.txt");
        try {

            PrintWriter pw = new PrintWriter("salidaProva.txt");
            lectura = new Scanner(fichero);

            while (lectura.hasNext()) {
                String p = lectura.next();

                String nuevaPalabra = barrejarParaula(p);
                System.out.println(nuevaPalabra);
                pw.write(nuevaPalabra + " ");

            }

            pw.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public static String barrejarParaula(String s) {
        String p = s.charAt(0) + "";
        
        if (s.length() > 3) {
            
            // letras es un substring amb els carcters que han de ser random
            String letras = s.substring(1, s.length() - 1);
            //els caracters que han de ser random 
            char[] array = new char[letras.length()];

            for (int i = 0; i < letras.length(); i++) {

                array[i] = letras.charAt(i);

            }
            char[] aux = new char[array.length];

            for (int i = 0; i < aux.length; i++) {
                boolean salir = false;
                while (!salir) {

                    int n = (int) (Math.random() * array.length);
                    if (array[n] != '±') {
                        aux[i] = array[n];
                        array[n] = '±';
                        salir = true;
                    }
                }
            }

            for (int i = 0; i < aux.length; i++) {
                p += aux[i] + "";
            }

            p += s.charAt(s.length() - 1);

        } else {

            p = s;

        }

        return p;

    }

}
