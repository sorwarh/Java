package ejercicios;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class UnEnterPositiu {
    
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        
        
        do {
            System.out.println("Numero");
            num=in.nextInt();
        
        
        }while(num<0) ;
        System.out.println("OK");
                    
        
    }
    
}
