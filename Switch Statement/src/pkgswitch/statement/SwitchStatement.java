/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.statement;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner read = new Scanner(System.in);
        System.out.println("Enter ur test score: ");
        int testscore = read.nextInt();
        System.out.println("Enter ur age: ");
        int studentage = read.nextInt();
        
        
        if(testscore>=70)
            if(studentage<10){
               System.out.println("You did a great job!");
            }else{
               System.out.println("You did pass.");
            }
        else{
                System.out.println("You did not pass");   
        }
                
        */
       /* int x =3;
        int y =2;
        int z =0;
        if(x>2)
            if(y>2) {
            z = x + y;               
                System.out.println("z is "+ z);
            }
        else{
                System.out.println("x is "+x);
        }             
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the model code of smart phone: ");
        int code = read.nextInt();
        int price;
             
      
        switch(code)
        {
            case 110 : 
                System.out.println("The price of smart phone is Rm500");
            break;
            case 210 :
                System.out.println("The price of smart phone is Rm1000");
            break;
            case 310 :
                System.out.println("The price of smart phone is Rm1200");
            break;
            default : System.out.println("Invalid Code");
        }
        
        /*int k = 20;
        switch(k/3)
        {
            case 2 :
                System.out.println("Zero");
                break;
            case 3 :
                System.out.println("One");
                break;
            default:
                System.out.println("default");
                break;
              
        }
        
        
        int keys =88;
        System.out.println("A piano has " +keys+ " keys"); 
        
        int x = 3, y= 20, z=4;
        
        if(z<=x)
        {
            z = x + 1;
        }
        else if(z <= y)
        { 
            z = z +9;
        }    
        else{
            y = ++y;
            x+=2;
        }
          System.out.println(x + " " + y + " " + z);
          
          final double G = 6.67*(Math.pow(10,-11));
          System.out.println("G is "+ G);
        
        
        }   */     
           
    }
        
    
    
}
