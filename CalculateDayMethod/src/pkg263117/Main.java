/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg263117;

/**
 *
 * @author Chew Teng
 */

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner read = new Scanner(System.in); 
       System.out.println("Enter one name of the day of the week: ");
       int dayName = read.nextInt();
       
       
       if (dayName == 1 )
       {
           System.out.println("It is monday");
           System.out.println("今天是星期一");
       }
       else if (dayName == 2)
       {
           System.out.println("It is tuesday");
           System.out.println("今天是星期二");
       }
       else if (dayName == 3)
       {
           System.out.println("It is wednesday");
           System.out.println("今天是星期三");
       }
       else if (dayName == 4)
       {
           System.out.println("It is thursday");
           System.out.println("今天是星期四");
       }
       else if (dayName == 5)
       {
           System.out.println("It is friday");
           System.out.println("今天是星期五");
       }
       else if (dayName == 6)
       {
           System.out.println("It is saturday");
           System.out.println("今天是星期六");
       }
       else if (dayName == 7)
       {
           System.out.println("It is sunday");
           System.out.println("今天是星期日");
       }
       else 
           System.out.println(dayName + " is not the name of the day of the week ");
                   
       
           
           
           
           
           
        
        
        
        
    }
    
}
