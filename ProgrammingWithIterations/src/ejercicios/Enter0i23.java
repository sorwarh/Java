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
public class Enter0i23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int num ;

    
        do {
            System.out.println("Numero?");
        num = in.nextInt();

    }while(num<0 || 23>num);
        System.out.println("Welldone");
        
     

    }

}
