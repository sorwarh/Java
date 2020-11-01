/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class PrintNumerosParyImpar {

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzc el Numero");
        num = in.nextInt();

        while (num != 0) {
            // mientras que el numero sea diferente a 0

            if (num % 2 == 0) {
                System.out.println("Numero Par");
                System.out.println("Weldone");
            } else {
                System.out.println("Numero IMPAR");
                System.out.println("Vuelva a INSTRODUCIR EL NUMERO");
                num=in.nextInt();
            }
        }

    }

}
