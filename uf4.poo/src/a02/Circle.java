
package a02;

import java.awt.Point;

/**
 *
 * @author sorwarhussian
 */
public class Circle extends Shape{
    
    private double radius;
    
    @Override
    public double area(){
        return Math.pow(radius, 2)*Math.PI;
     }
    
    public  Circle (Point org, double rad){
    super (org);
    this.radius=rad;
    
    }
    
    public Circle (){
    }

    public double getRadius() {
        return radius;
    }
    
    @Override
    public double  perimeter (){
        return 2*Math.PI*radius;
    } 

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
}
