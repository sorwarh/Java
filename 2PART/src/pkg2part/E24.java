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
public class E24 {
    
    public static void main(String[] args) {
        
        // Escriu un programa que llegeix dos valors numèrics enters per teclat i diu si tots dos són parells o senars.
        
        Scanner in=new Scanner(System.in);
        
       int num1, num2;
       
        System.out.println("Introdzca el numero?");
        num1=in.nextInt();
        num2=in.nextInt();
        
        if(num1%2==0 && num2%2==0){
            System.out.println("El dos numeros son parells");
        }
        
        else if (num1%2==0 || num2%2==0){
            System.out.println("Un del dos numeros es parell");
        }
        else{
            System.out.println("El dos numeros son imparells");
        }
        
        
        
        
        
    }
    
}
