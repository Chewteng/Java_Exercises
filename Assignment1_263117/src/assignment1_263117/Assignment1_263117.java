/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_263117;

/**
 *
 * @author 
 */
import java.util.Scanner;
public class Assignment1_263117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the water usage in " + "(meter^3): ");
        int use = read.nextInt();
        double result ;
        if (use>=0 && use<=20)
            result = use* 0.40;
            
        else if (use>=21 && use<=40)
            result = 8 + ((use-20)*0.70);
        
        else if (use>=41 && use<=60)
            result = 8 + 14 + ((use-40)*0.90);
        
        else 
            result = 8 + 14 + 18 + ((use-60)*1.10);
        
        System.out.printf("The payment amount of the user for water usage is "
                + "%.2f\n",result);
        
        
        System.out.println("\nAnother Question:\n");
        
        System.out.print("Enter number 1 : ");
        int number1 = read.nextInt();
        
        System.out.print("\nEnter number 2 : ");
        int number2 = read.nextInt();
        
        System.out.print("\nEnter number 3 : ");
        int number3 = read.nextInt();
        
        int max;
        
        if(number1>number2 && number1>number3)
            max = number1;
        else if(number2>number1 && number2>number3)
            max = number2;
        else 
            max = number3;
        
        System.out.println("The biggest number : "+ max);
        
        
        
        
        
        
        

    }
}
