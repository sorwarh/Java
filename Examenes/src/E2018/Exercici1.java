/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2018;

/**
 *
 * @author sorwarhussian
 */
public class Exercici1 {

    public static void main(String[] args) {

        char[] array = new char[50];

        for (int i = 0; i < array.length; i++) {

            int x = (int) (Math.random() * 2);
            if (x == 1) {

                array[i] = '<';

            } else {
                array[i] = '>';
            }
            System.out.print(array[i] + " ");

        }
        int cont = 0;
        for (int i = 0; i < array.length-1; i++) {

            if (array[i] == '<') {

                if (array[i + 1] == '>') {

                    cont++;
                }

            }

        }
        System.out.println("\nHay "+cont +" Diamantes *");

    }

}
