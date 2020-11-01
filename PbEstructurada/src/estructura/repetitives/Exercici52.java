package estructura.repetitives;

import java.util.Scanner;

/** 52. Escriu un programa que donat un enter ​N,​ escrigui tots els enters entre 0 i ​N.
 *
 * @author sorwarhussian
 */
public class Exercici52 {
    
    public static void main(String[] args) {
        
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Numero?");
        num=in.nextInt();
        
        while(num>=0){
            System.out.println(num);
            num--;
            
        
        }
        
    }
    
}
