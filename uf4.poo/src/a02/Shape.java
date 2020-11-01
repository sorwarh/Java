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
public  class  Shape {

    private Color color;
    private Point origen;

    public double area() {
        return origen.x * origen.y;
    }

    public Color getColor() {
        return color;
    }

    public Point getOrigen() {
        return origen;
    }
    
    public double perimeter (){
        
        return (origen.x+origen.y)*2;
    
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setOrigen(Point origen) {
        this.origen = origen;
    }
    
    protected Shape( Color col , Point org){
        this.color= col;
        this.origen=org;
        
    }
    
    protected Shape (){
    
    }
    
    protected Shape (Point org ){
        this.origen=org;
    
    }
    
    
}
