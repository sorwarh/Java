/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01;
import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class AscensorMain {

    public static void main(String[] args) {


        Ascensor a= new Ascensor("ThyssenKrupp", 8);
        Ascensor b = new Ascensor("Fuji Tec", 4);
        Ascensor c = new Ascensor("Schindler", 12);
        
        System.out.println(a.toString());
        int numeroPersones=5;
        
       a.funcionament(numeroPersones);
        
        
    }

    

}
