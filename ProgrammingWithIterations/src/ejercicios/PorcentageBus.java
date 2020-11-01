package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class PorcentageBus {

    public static void main(String[] args) {
        final int asientos = 56;
        int pasajeros;
        double ratio;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el numero de pasajeros " + "Cantidad maxima " + asientos);
        pasajeros = in.nextInt();

        while (pasajeros < 0 || pasajeros > asientos) {
            if (pasajeros > asientos) 
                System.out.println("Error, vuelva a introducir el numero de pasajeros");
            else 
                System.out.println("Error, vuelva a introducir el numero de psajeros");
            pasajeros=in.nextInt();
           
            
               
                
            }
            ratio=(double)pasajeros / asientos;
            DecimalFormat fmt=new DecimalFormat("0.##");
            
            System.out.println("Este bus " +fmt.format(ratio*100) +" % full");
            
        }

    }


