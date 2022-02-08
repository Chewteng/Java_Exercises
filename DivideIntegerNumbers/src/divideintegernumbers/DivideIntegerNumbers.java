/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideintegernumbers;

/**
 *
 * @author Chew Teng
 */

import java.util.Scanner;
public class DivideIntegerNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Questions : Take two integer numbers.Divide that number and display the result in decimal points.
        Scanner read = new Scanner(System.in);
        
        //Input
        System.out.println(" Enter a integer number: ");
        int num1 = read.nextInt();
        System.out.println(" Enter the another integer number: ");
        int num2 = read.nextInt();
        
        //Calculation
        double result =  num1/num2; // same as double result =(double)num1/num2
        //The answer will get integer as int divide int if does not have (double), the computer read right side first before left
                                               
        //Output
        System.out.println(" The division for two integer numbers is "+result);
            
    }
    
}
