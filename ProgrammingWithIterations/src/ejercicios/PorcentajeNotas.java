package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * App que calcula por centage de la nota media
 *
 * @author sorwarhussian
 */
public class PorcentajeNotas {

    public static void main(String[] args) {
        final int nota = 101;
        int asg1, asg2, asg3, asg4, asg5, sumnota;
        double porcentaje;

        Scanner in = new Scanner(System.in);

        System.out.println("Nota ASG1");
        asg1 = in.nextInt();
        asg1++;
        System.out.println("Nota ASG2");
        asg2 = in.nextInt();
        asg2++;
        
        System.out.println("Nota ASG3");
        asg3 = in.nextInt();
        asg3++;
        
        System.out.println("Nota ASG4");
        asg4 = in.nextInt();
        asg4++;
        
        System.out.println("Nota ASG5");
        asg5 = in.nextInt();
        asg5++;
        
        while (asg1 > nota || asg2 > nota || asg3 > nota || asg4 > nota || asg5 > nota) {
            System.out.println("Nota no aceptable, Vuelva a introducir la nota");
            if(asg1>nota);
            System.out.println("Vuelva a introducir la nota ASG1");
            asg1 = in.nextInt();
            if (asg2>nota);
            System.out.println("Vuelva a introducir la nota ASG2");
            asg2 = in.nextInt();
             if(asg3>nota);
            System.out.println("Vuelva a introducir la nota ASG3");
            asg3 = in.nextInt();
             if(asg4>nota);
            System.out.println("Vuelva a introducir la nota ASG4");
            asg4 = in.nextInt();
            if(asg5>nota);
            System.out.println("Vuelva a introducir la nota ASG5");
            asg5 = in.nextInt();
            
            
                
        }
        sumnota = asg1 + asg2 + asg3 + asg4 + asg5;

        porcentaje = (double) sumnota /505;

        DecimalFormat formato = new DecimalFormat("0.##");

        System.out.println("Su porcentaje de nota es " + formato.format(porcentaje * 100) + " %");
        if (sumnota >= 250) {
            System.out.println("Esta aprobado");
        }else System.out.println("Suspendido");
        
         
        System.out.println("");
    }

    }
