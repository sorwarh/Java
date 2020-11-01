
package projects;

import java.util.Scanner;

/** Programa que genera 1 Numero Aleatorio de 1-10 y el usuario tiene 3 intentos para acertar el numero y llevarse un premio.
 *
 * @author sorwarhussian
 */
public class AcetarNumero_Premio {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Juego consiste en acertar un numero de 1 a 10 \nTiene 3 intentos"
                    + "\nSi acierta  a la primera premio sera de 1.000€"
                    + "\nSi acierta con 1 intentos premio sera de 500€"
                    + "\nSi acierta con 2 intentos premio sera de 200€"
                    + "\nIntroduzca su nombre");
        String nombreUser=entrada.nextLine();
        
        int error=0,num,numUser;
        boolean salir=false;
        num=(int)(Math.random()*11);
        
        System.out.println("El numero es " +num);
       
        
        
        do {
            System.out.println("Introduce el numero");
            numUser=entrada.nextInt();
            if (numUser!=num) {
                System.out.println("Error! Te quedan "+(2-error)+" Intentos" );
                error++;
            }
            if (error==3 || numUser==num) {salir=true;}
        
        }while (!salir );
        
        if (numUser==num) {
        
            System.out.println("Has ganado ");
            switch (error) {
                case 0:
                    System.out.println("Tu premio es de 1.00€");
                    break;
                case 1:
                    System.out.println("Tu premio es de 500€");
                    break;
                case 2:
                    System.out.println("Tu premio es de 200€");
                    break;
                default:
                    break;
            }
            System.out.println("Enhorabuena!!!");
            
        } else {
            System.out.println("Has aprovechado todos tus intentos pero no has podido acertar. ");
            System.out.println("Gracias por participar al juego ! ");
            }
        
        System.out.println("");
        
                    
        
        
    }
    
}
