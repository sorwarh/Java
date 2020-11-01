/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author sorwarhussian
 */
public class Contador {

    public static void main(String[] args) {
        final int LIMIT = 10;
        int count = 1;
        while (count <= LIMIT) {
            System.out.println(count);
            count = count + 1;
        }
        System.out.println("Done.");
    }

}
