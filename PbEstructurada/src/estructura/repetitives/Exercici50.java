
package estructura.repetitives;

/** . Escriu un programa que mostri per pantalla la suma dels 50 primers números parells (2, 4, 6, ...)
 *
 * @author sorwarhussian
 */
public class Exercici50 {
    
    public static void main(String[] args) {
        int suma=2, num=2;
        while(num<=100){
            if(num %2 ==0)
                System.out.println(suma);
            suma+=num++;
 
        }
    }
                
    
}
