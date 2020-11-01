
import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class Parcial2016 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase;

        System.out.println("Frase?");
        frase = in.nextLine().toLowerCase();
        int i = 0;
        int consonante = 0;
        while (i < frase.length()) {
            if (frase.charAt(i) == 'a'
                        || frase.charAt(i) == 'e'
                        || frase.charAt(i) == 'i'
                        || frase.charAt(i) == 'o'
                        || frase.charAt(i) == 'u'
                        || frase.charAt(i) == ' '
                        || (frase.charAt(i) >= '0' && frase.charAt(i) <= '9')) {
            } else {
                consonante++;
            }
            i++;
        }
        System.out.println("Les consonants son " + consonante);
    }

}
