
package estructura.repetitives;

/** 49. Escriu un programa que mostri la suma dels 100 primers números naturals (1, 2, 3, ..., 100).
 *
 * @author sorwarhussian
 */
public class Exercici49 {
    public static void main(String[] args) {
        
        // INTENTO 1 fallido
        /**int numero=1;
         String suma="";
        while(numero<=100){
            suma+=numero;     
            System.out.println(suma); 
   
        } */
        
       /**INTENTO 2, CON for 
       int suma =0;
       for(int i=1; i<=100 ; i++){
       suma = suma +i;
           System.out.println(suma);
       } */
        
       //intento3: while
       
       int suma=0;
       int numero=0;
       while(numero<=100){
       suma+= numero++;
           System.out.println(suma);
       
       }
       
       
       
       
       
       
       
       
       
    }
    
}
