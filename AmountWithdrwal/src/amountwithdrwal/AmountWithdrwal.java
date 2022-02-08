/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amountwithdrwal;

/**
 *
 * @author Chew Teng
 */

import java.util.Scanner;
public class AmountWithdrwal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw from ATM ==> ");
        //Input
        int withdrawalamount = read.nextInt();
        
        //Calculation
        int notesrm50 = withdrawalamount/50; //calc notes RM50
        int balance = withdrawalamount%50; //calc reminder of the above calc
        int notesrm10 = balance/10;
        
        //Output
        System.out.println(" The notes of RM50 withdraw is " +notesrm50); 
        System.out.println(" The notes of RM10 withdraw is " +notesrm10);
        System.out.printf(" The notes of RM50 notes is %d and RM10 notes is %d\n "
        ,notesrm50,notesrm10);
    }
    
}
