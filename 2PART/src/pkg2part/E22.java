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
public class E22 {
    public static void main(String[] args) {
        
        //22. Escriu un programa que calcula i mostra el resultat de la fórmula ,on ​a,​​b​, i ​c,​es demanen per teclat.
        
        int a,b,c;
        Scanner in=new Scanner(System.in);
        
        System.out.println("Introduzca los numeros [A y b ]");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Ahora divisor(C) [C no puede ser 0]");
        c=in.nextInt();
        
        if(c>0){
        double resultat= (a+b)/c;
            System.out.println("El resultado es= " +resultat);
        } else {
            System.out.println("No es possible realizar calculo");
            System.out.println("Ha introducido valor nulo del divisor");
        }
        
    }
    
}
