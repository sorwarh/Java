/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3part;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class E51 {
    public static void main(String[] args) {
        
        //51. Escriu un programa que donat un enter ​N,​ escrigui ​N vegades el missatge 
        //“No arribaré mai tard a classe de programació”.
        
        int num=0 , repetir;
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Numero");
        repetir=in.nextInt();
        
        while(num<repetir) {
            System.out.println("No arribare mai a tard a classe de programacio");
            
            num++;
            // si repetir++, saldra infinitas veces el mensage 
        }
        
        
    }
    
}
