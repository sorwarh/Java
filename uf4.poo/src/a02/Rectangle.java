/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a02;

import java.awt.Point;

/**
 *
 * @author sorwarhussian
 */
public class Rectangle extends Shape {

    private double widht, height;

    @Override
    public double area() {
        return widht * height;
    }

    public double getW() {
        return widht;
    }

    public double getH() {
        return height;
    }
    
    @Override
    public double perimeter (){
        return 2 * (widht * height);
    }
    //constructor 
    public Rectangle (Point org, double w, double h  ){
        super(org);
        this.height=h;
        this.widht=w;
    }
    
    public Rectangle  (){}

    public void setWH(double w, double h ) {
        this.widht = w;
        this.height= h ;    
    }

}
