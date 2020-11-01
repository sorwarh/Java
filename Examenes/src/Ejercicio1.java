
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sorwarhussian
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("N");
        int n = entrada.nextInt();

        int[] array = new int[n];

        int[][] nuevoarray = new int[n][4];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");

        }

        System.out.println("");
        int f=0;
        
        while (f<array.length) {
           
            
            if (f%4==0){
                System.out.println("");
            }
            System.out.print(array[f]+" ");
            f++;
        }

        

    }

}
