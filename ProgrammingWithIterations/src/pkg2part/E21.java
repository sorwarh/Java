
package pkg2part;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class E21 {
    
    public static void main(String[] args) {
        
        // 21 .Escriu un programa que llegeix un número i mostra si és positiu, negatiu o zero.
        
       Scanner in=new Scanner(System.in);
       
       int num;
       
        System.out.println("Introduzca el numero");
        num=in.nextInt();
        
        if(num>0){
            System.out.println("Numero Positiu");
        }
        else if(num==0){
            System.out.println("No es aceptable el numero, vuelva a introducir el numero");
       
        }else{
            System.out.println("Numero Negativo");
        }
       
       
        
    }
    
}
