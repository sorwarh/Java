/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.WHILE;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class NumeroPositivoONegativo {
    
    public static void main(String[] args) {
        
        // Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
        
        Scanner  in=new Scanner(System.in);
        int numero;
        System.out.println("Numero??");
        numero=in.nextInt();
        
        while(numero!=0) {
        
            if(numero>0) {
                System.out.println("Numero positivo");
            }else {
                System.out.println("Numero Negativo");
            }
            
            System.out.println(" Again Numero");
            numero=in.nextInt();
            
        
        }
        System.out.println("Ha introducido un 0 ");
        
    }
    
}
