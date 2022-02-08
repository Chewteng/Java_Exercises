/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinheritance;

/**
 *
 * @author Chew Teng
 */
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double area(){
        return length*width;
    }
    
    public String toString(){
        return ("length = " + length + "\t" +"width = " + width );
    }
}
