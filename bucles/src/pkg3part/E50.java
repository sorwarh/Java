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
public class E50 {

    public static void main(String[] args) {

        //50. Escriu un programa que mostri per pantalla la suma dels 50 primers números parells (2, 4, 6, ...)
        int num = 2, suma = 2;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(suma);
            }
            suma += num++;

        }
    }

}
