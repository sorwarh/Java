/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lletras;

import java.util.Scanner;

/**
 *
 * @author sorwarhussian
 */
public class Contrasena {
    
    public static void main(String[] args) {
        
        //app que pide la contrasena
        
        
        Scanner  in=new Scanner(System.in);
        String clave = "sorwar";
        String passwd;
        
        System.out.println("Contrasena??");
        passwd=in.next();
        
        while(!(clave.equals(passwd))) {
            
            System.out.println("Error \n"
                        + "Vuelva a poner la clave");
            
            passwd=in.next();
            
        
        }
        System.out.println("Acceso Permitido");
        
        
    }
    
}
