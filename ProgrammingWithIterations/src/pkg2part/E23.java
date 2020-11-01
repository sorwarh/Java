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
public class E23 {
    
    public static void main(String[] args) {
        
        // Escriu un programa que demana un número per teclat i diu si és parell o senar. El zero es considera parell.
        
        
        int num;
        Scanner in=new Scanner(System.in);
        
        
        System.out.println("Introduzca el Numero");
        num=in.nextInt();
        
        if(num %2==0 || num==0){
            System.out.println("Numero Parell");
        } else {
            System.out.println("Numero Imparell");
        }
            
        

    }
    
}
