/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_263117;

/**
 *
 * @author
 */
import java.util.*;
public class Assignment2_263117 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Group members:
        // LIM WEI YI    (261307)
        //H'NG CHEW TENG (263117)
        
        Scanner read = new Scanner(System.in);
        System.out.print("How many inputs you want to enter => ");
        int input = read.nextInt();
        
        double [] array = new double [input];
        
        for(int num=0 ; num < array.length; num++){
            System.out.print("Enter the number "+(num+1)+": ");
            array[num] = read.nextDouble();
        }
        System.out.println(" ");
        
        System.out.print("Numbers not in arranging order: ");
        
        for(int num=0 ; num < array.length; num++)
        System.out.print( " " +array[num]);
        System.out.println("\n\n");
        
        System.out.println("After sorting the numbers, it is as shown below:");
        
        //Arrange elements in ascending Order
        System.out.print("Numbers in Ascending Order: " );
        for(int num = 0; num < array.length; num++) {
        Arrays.sort(array);
        System.out.print( " " +array[num]);
        }
        System.out.println("\n");
        
        //Arrange elements in descending Order
        System.out.print("Numbers in Descending Order: " );
        for(int num = array.length-1; num >= 0; num--) {
        Arrays.sort(array);
        System.out.print( " " +array[num]);
        }
        
        System.out.println(" ");
             
    }
               
    
}
