/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lletras;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class VocalBucle {

    public static void main(String[] args) {

        //demana una letra y diu si es vocal o no 
        Scanner in = new Scanner(System.in);

        char letra;

        System.out.println("Letra??");
        letra = in.next().charAt(0);

         // if (letra == 'a' || letra == 'e' || letra == 'o' || letra == 'i' || letra == 'u') {
         
         while(letra != 'a' && letra != 'e' && letra != 'o' && letra != 'i' && letra != 'u') {
             System.out.println("No es un vocal \n"
                         + "Letra!?!?!?!");
             letra=in.next().charAt(0);
             
         }
         System.out.println("Es un vocal");

    }

}
