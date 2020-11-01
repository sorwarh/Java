/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2part;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class E28 {

    public static void main(String[] args) {

        // Escriu un programa que llegeix el vostre dia, mes i any de naixement 
        //i el dia, mes i any actual i mostra si sou majors d'edat o no.
        Scanner in = new Scanner(System.in);
        int dia, mes, any, any2,mes2;
        System.out.println("Any? \n"
                    + "Mes? \n"
                    + "Dia? \n");
        any = in.nextInt();
        mes = in.nextInt();
        dia = in.nextInt();
        
        System.out.println("Fecha actaul \n"
                    + "Any \n"
                    + "Mes \n");
        any2 = in.nextInt();
        mes2= in.nextInt();
        
        if((any2-any)>=18) {
            System.out.println("Ets Major d'Edat");
        }else{
            System.out.println("Menor d'Edat");}
        
        

    }

}
