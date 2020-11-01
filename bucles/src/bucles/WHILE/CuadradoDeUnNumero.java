/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.WHILE;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class CuadradoDeUnNumero {

    public static void main(String[] args) {

        // Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Nuumero??");
        numero = scan.nextInt();

        while (numero >= 0) {

            int cuadrado = numero * numero;

            System.out.println("El cuadrado del numero es " + cuadrado);
            System.out.println("Vuelva a introducir un numero");
            numero = scan.nextInt();
            

        }
        System.out.println("numero no valido");

    }

}
