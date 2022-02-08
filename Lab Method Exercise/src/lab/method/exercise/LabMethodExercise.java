/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.method.exercise;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class LabMethodExercise {

    /**
     * @param args the command line arguments
     */
    public static char ht;
    public static String result;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a character whether a or d: ");
        ht = read.nextLine().charAt(0);
        
        do{
           if(ht != 'a'&& ht != 'd' ) {
               System.out.println("You have entered incorrect input.");
               System.out.println("Enter the character again: ");
               ht = read.nextLine().charAt(0);
           }
        }while (ht != 'a' && ht != 'd');
        System.out.println("You have entered correct input.");
        processChar();
    }
    
    public static void processChar(){
        switch(ht)
         {
             case 'a' : result = "Apple"; break;
             case 'd' : result = "Donkey"; break; 
             default :  result = "Incorrect input"; break;
         } 
       
        displayResult();
         
     }
    
    public static void displayResult(){
        System.out.println("The input data is "+ ht);
        System.out.println("The result outcome is "+result);  
    }
    
}
   
    

