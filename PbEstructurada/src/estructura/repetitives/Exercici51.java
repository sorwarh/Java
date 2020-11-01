
package estructura.repetitives;

import java.util.Scanner;

/** 51. Escriu un programa que donat un enter ​N,​ escrigui ​N vegades el missatge 
 * “No arribaré mai tard a classe de programació”
 *
 * @author sorwarhussian
 */
public class Exercici51 {
    
    public static void main(String[] args) {
        
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Numero?");
        num=in.nextInt();
        while(num!=0){
            
            System.out.println("No arribare mai tard a classe de programacio");
            num=num++;
            
  
        
        }
        
    }
         
    
}
