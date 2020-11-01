package ejercicios;

import java.util.Scanner;

/** Usuari ha de teclejat n o s . 
 *
 * @author sorwarhussian
 */
public class caracter {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        char letra;
        
        do{
            System.out.println("[s/]?");
            letra=in.next().charAt(0);
            
        }while(letra == 's' && letra == 'n');
        System.out.println("Moltbeee");
        
    }
    
}
 