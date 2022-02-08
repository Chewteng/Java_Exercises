/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class LabExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        /*//Specifying Array Size during Runtime:
        
        System.out.println("\n\n");
        
        int num[] = new int[arrSize];
        for(int i=0;i<arrSize;i++){
            System.out.println("Pls enter input number "+(i+1)+" => ");
            num[i]= read.nextInt();
    }
        
        System.out.println("\n\nAfter Looping: ");
        System.out.println("Index 1 ==>  "+ num[1]);
        System.out.println("Index 2 ==>  "+ num[2]);
        */
        
        System.out.print("Enter the size of the array => ");
        int arrSize = read.nextInt();
        
        double [] num = new double[arrSize];
        
        //display the content of the array
        for(int i=0;i<arrSize;i++){
            System.out.println("Pls enter input number "+(i+1)+" => ");
            num[i]= read.nextInt();
        }
        System.out.println("\n");
        System.out.print("The input number in order is");
        for(int i=0;i<arrSize;i++){
            System.out.print(" "+num[i]);
        }
        
        //display the content of the array in the reverse order
        System.out.println("\n");
        System.out.println("After reversing: ");
        System.out.println("The reverse of input number is");
        for(int i=arrSize-1; i>=0; i--){
            System.out.print(" "+num[i]);
        }
       System.out.println(" ");
        
       //declare&initialize an array
       int [] arr = {50,20,40,10,100,60,30,80};
        
        
    }
    
}
