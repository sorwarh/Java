/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2part;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class E25_26 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        // 26. Escriu un programa que llegeix tres números i diu quin és el més gran.
        System.out.println("Numero??");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mes gran " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mes gran " + num2);

        }else if (num1==num2 && num1==num3) {
            System.out.println("El 3 numeros son igual");
        } else {
            System.out.println("El numero mes gran " +num3);
        }
    }

}
