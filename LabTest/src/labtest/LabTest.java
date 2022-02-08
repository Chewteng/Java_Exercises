/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class LabTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner (System.in);
        int num;
        
        do{
            System.out.print("Enter a number ==> ");
            num = read.nextInt();
            
            System.out.print("You have entered "+ num + ". ");
            
            if(num!=0){
               if (num%5==0){
                
                System.out.println("This number CAN be divided by 5.");
            }
              
               else {
                
                System.out.println("This number CAN NOT be divided by 5.");
            }
                System.out.println("");
           }  
        } while(num != 0);
        System.out.println("Good Bye.");
         
        
        /*Scanner g = new Scanner(System.in);
        System.out.println("Enter a number: > ");
        int m = g.nextInt();
        do{
            if(m%5==0)
                System.out.printf("You enter %d. This number CAN be divided by 5.%n",m);
            else
                System.out.printf("You enter %d. This number CAN NOT be divided by 5.%n",m);
            
            System.out.println("\nEnter a number:(enter 0 to stop) > ");
            m = g.nextInt();
            
        }while(m>0);
        System.out.println("You have entered 0. Good Bye. ");
        */       
    }
                
    
}
