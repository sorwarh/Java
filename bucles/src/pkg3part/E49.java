/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3part;

/**
 *
 * @author sorwarhussian
 */
public class E49 {

    public static void main(String[] args) {

        // 49. Escriu un programa que mostri la suma dels 100 primers números naturals (1, 2, 3, ..., 100).
        int num = 1;
        int suma = 0;
        // usar suma como una aux y declarar y asignar 0 al principio

        while (num <= 100) {
            suma += num++;
            //suma empieza de 0, pero luego se suma todos los num++

            System.out.println(suma);

        }
    }

}
