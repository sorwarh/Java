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
public class E52 {
    
    
    public static void main(String[] args) {
        
        //52. Escriu un programa que donat un enter ​N,​ escrigui tots els enters entre 0 i ​N.
        
        int num;
        
        Scanner  in=new Scanner(System.in);
        
        System.out.println("Numero?");
        num=in.nextInt();
        
        while(num>=0) {
            System.out.println(num);
            num--;
        }
        
                    
                    
    }
    
}
