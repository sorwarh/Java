/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.DOWHILE;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class agosto28_do_while {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char letra;
        char cafe = 'c', postre = 'p', tot = 't';

        do {

            System.out.println("Letra");
            letra = in.next().charAt(0);

            if (letra == cafe) {
                System.out.println("cafe");
            } else if (letra == postre) {
                System.out.println("Postre");
            } else if (letra == tot) {
                System.out.println("tot");
            }

        } while (!(letra == cafe || letra == postre || letra == tot));

    }

}
// mejorar version son Switch 