/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a02;
import java.awt.Color;
import java.awt.Point;
/**
 *
 * @author sorwarhussian
 */
public class Prova {

    public static void main(String[] args) {
        
        Shape shape= new Shape ();
        
        Shape cercle= new Circle ();
        
        System.out.println(shape instanceof Shape);
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Object);
        
     
        Shape  shape2= new Shape ();
        
        shape2= cercle; 
        
        System.out.println(shape2 instanceof Shape);
        System.out.println(shape2 instanceof Circle);
        System.out.println(shape2 instanceof Object);
        
        
        

    }

}