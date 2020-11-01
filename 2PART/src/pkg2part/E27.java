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
public class E27 {
    
    public static void main(String[] args) {
        
        //27. Escriu un programa que demana el vostre any i mes de naixement, l'any i mes actual i mostra l'edat que teniu.
        
        Scanner in=new Scanner(System.in);
        
        int any,mes,edat;
        
        System.out.println("Any?");
        any=in.nextInt();
        System.out.println("Mes");
        mes=in.nextInt();
        
        System.out.println("Tens" +(2018-any) +" anys " + " i " +(11-mes) +" mesos" );
        
        
        
    }
    
}
