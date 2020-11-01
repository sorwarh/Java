/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2018;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class ProvaCable {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        BobinaCable p1, p2, p3, p4, p5;
         double preu = 0;
        
        p1 = new BobinaCable(270, 2, 0.35, "No");
        p2 = new BobinaCable(50, 1, 0.15, "NO");
        p3 = new BobinaCable(30, 1.5, 0.25, "NO");
        p4 = new BobinaCable(25, 1, 0.15, "NO");
        p5 = new BobinaCable(10, 1, 0.15, "NO");
        
        BobinaCable[] array = new BobinaCable[5];
        
        array[0] = p1;
        array[1] = p2;
        array[2] = p3;
        array[3] = p4;
        array[4] = p5;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        
    }
    
}
