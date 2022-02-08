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
public class Box extends Rectangle 
{
    private double height;
    
    public Box(double l, double w, double h) {
        super(l, w);
        height = h;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double area(){
        return 2*(getLength()*getWidth()+getLength()*height+getWidth()*height);
    }
    
    public double volume(){
        return super.area()*height;
    }
    
    public String toString(){
        return (super.toString()+"\t"+ "height = "+ height);
    }
}
