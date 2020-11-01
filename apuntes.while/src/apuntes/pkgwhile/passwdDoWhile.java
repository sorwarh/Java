
package apuntes.pkgwhile;

import java.util.Scanner;

/** App que demana el passwd . Metode Do + While
 *
 * @author sorwarhussian
 */
public class passwdDoWhile {
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String passwd="sorwar1234", intropass;
        do {
            System.out.println("Intro the passwd");
            intropass=in.next();
            
        } while(!intropass.equals(passwd));
        System.out.println("Correct passwd. ");
        
    }
    
}
