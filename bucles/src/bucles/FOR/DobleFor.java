/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.FOR;

/**
 *
 * @author sorwarhussian
 */
public class DobleFor {

    public static void main(String[] args) {
        String s = "";
        for (int num = 0; num < 10; num++) {

            //hace print 0 a 9 en una fila 
            s = s + num + " ";

            // s guarda todo los numero(num++) y deja un espacio " "
            // para que todos lo numeros no salgan juntos
            //dentro de un for otro for
            for (int num2 = 0; num2 < 10; num2++) {

                s = s + " " + num + num2;
                // print de 0 a 99
            }
            //print 0 a 100 sea 10x10 (salto a la linea)
            s = s + "\n";

        }

        System.out.println(s);
    }

}
