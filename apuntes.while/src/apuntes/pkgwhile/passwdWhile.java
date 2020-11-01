
package apuntes.pkgwhile;

import java.util.Scanner;

/** App que demana la passwd. Metode while.
 *
 * @author sorwarhussian
 */
public class passwdWhile {
    
    public static void main(String[] args) {
        String passwd="sorwar1234", intropass;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Intro Passwd");
        intropass=in.next();
        
        while(!intropass.equals(passwd)){
           System.out.println("Intro Passwd");
        intropass=in.next();
        }
        if(intropass.equals(passwd)) {
            System.out.println("Correct Passwd. Acces Permited");
        
        }
        
    }
    
}
