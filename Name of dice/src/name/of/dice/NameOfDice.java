/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.of.dice;

/**
 *
 * @author 
 */
import java.util.Scanner;
public class NameOfDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        System.out.println("Please enter a value of the dice: ");
        int v = read.nextInt();
        
        //test the value
        if(v==1)
            System.out.println("The name of the dice is one");
        else if(v==2)
            System.out.println("The name of the dice is two");
        else if(v==3)
            System.out.println("The name of the dice is three");
        else if(v==4)
            System.out.println("The name of the dice is four");
        else if(v==5)
            System.out.println("The name of the dice is five");
        else if(v==6)
            System.out.println("The name of the dice is six");
        else
            System.out.println("Invalid input");
    }
    
}
