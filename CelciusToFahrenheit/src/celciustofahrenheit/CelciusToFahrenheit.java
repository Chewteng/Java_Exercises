/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celciustofahrenheit;

/**
 *
 * @author Chew Teng
 */

import java.util.Scanner;
public class CelciusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Request a Celcius value and convert it to Fahrenheit.
        Scanner read = new Scanner(System.in);
        System.out.println(" Enter any value of celcius: ");
        
        //input
        int celcius = read.nextInt();
        
        //Calculation
        double fahr = celcius*1.8+32;
        
        //output
        System.out.printf(" Celcius %d is equal to fahrenheit %.2f\n ",celcius,fahr);
       
        int greeting = 20;
        String age = "nineteen";
        String name = "Rahmat";
    }
    
}
