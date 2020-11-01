/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3part;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class E54 {

    public static void main(String[] args) {

        //Escriu un programa que donats dos enters ​a i ​b​, escrigui tots 
        //els naturals entre ells. Exemple, si ​a​=3 i ​b​=9, mostrarà 4,5,6,7 i 8
        Scanner in = new Scanner(System.in);

        int a, b, numero = 0;

        do {

            System.out.println("Dos numeros?");
            a = in.nextInt();
            b = in.nextInt();
        } while(a==b) ;
        
        
        System.out.println(numero);
        
        
        
        
        
        
        
    }

}
