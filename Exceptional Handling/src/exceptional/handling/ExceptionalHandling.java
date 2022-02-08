/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptional.handling;

/**
 *
 * @author Chew Teng
 */
public class ExceptionalHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a= 30, b=0;
            int c = a/b;
            System.out.println("Result = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide a number by zero.");
        }
        
        try{
            try{
            int num = Integer.parseInt("Edureka");
            System.out.println(num); 
            }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }    
            try{
                int a[]=new int[5];
                a[7]=9;
            }
            catch(Exception e)
            {
                System.out.println("Handled");
            }
            
         System.out.println("Other statement");
         
        }    
         
        catch(Exception e)
        {
            System.out.println("Recovred.");
        }
        
        //This block is always executed
        finally{
            System.out.println("Finally block is executed");
        }
    }
    
}
