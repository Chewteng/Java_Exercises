/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume.of.cube;

/**
 *
 * @author Chew Teng
 */
public class VolumeOfCube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //input
        int length = 3;
        
        //process
        int volume = 3*(length);
        //or length*length*length
        
        //output
        System.out.println(" The length for the cube is "+volume);
        
       //input
        int a = 3;
        int b = 6; 
        int c = 2;
     
        //process
        double result = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        
        //output
        System.out.printf(" The result is %.3f\n ",result);
        
        
        
    }
    
}
