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
public class SiDosNumerosSonMultplies {

    public static void main(String[] args) {

        //Pedir dos números y decir si uno es múltiplo del otro.
        int num1, num2;
        Scanner in = new Scanner(System.in);

        System.out.println("Numer1??");
        num1 = in.nextInt();
        System.out.println("Numero2?");
        num2 = in.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("Son multiplos");

        } else {
            System.out.println("No son multplies");
        }

    }

}
