/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterbills;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class WaterBills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] data = new double [2];
        System.out.println("Please enter two temperature values: ");
        Scanner read = new Scanner(System.in);
        
        //read input from keyboard and sum all temperature values
        double sum = 0.0;
        for (int i=0; i<data.length; i++){
            System.out.printf("The temperature values %d - ",(i+1));
            data[i] = read.nextDouble();
            sum +=data[i];
        }
        System.out.println("The sum all temperature values is "+sum);
        
        //display all elements of the array data
        for (int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }   
        
        //compute and display the average temperature
         double average = sum/data.length;
         System.out.println("The average temperature is "+average);
        
    }
    
}
