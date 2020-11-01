package estructura.repetitives;

import java.util.Scanner;

/**
 * 53. Escriu un programa que demani números per teclat fins a introduir el
 * valor zero i després mostri quants valors dels introduïts han estat parells.
 *
 * @author sorwarhussian
 */
public class Exercici53 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int num;
        String aux="";
        
        
        System.out.println("Numero??");
        num=in.nextInt();
        while(num!=0){
            System.out.println("Numero??");
            num=in.nextInt();
            num++;
            
            if(num==0){
                int valor= (num %2 );
                
                System.out.println(valor);
                valor++;
            }
            
        
        }


        
    }
  
   }

