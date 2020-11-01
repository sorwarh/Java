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
public class E48 {

    public static void main(String[] args) {

        //48. Escriu un programa en Java que mostri per pantalla tots els números parells des del 2 fins al 100.
        int num = 2;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
             num++;
            // contador fuera del IF
            //si el contador esta fuera del if o while, saldra infintas veces 2. 

        }
       
    }

}
