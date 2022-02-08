/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentloan.pkg263117;

/**
 *
 * @author Chew Teng
 */

import java.util.Scanner;
public class StudentLoan263117 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // GROUP MEMBERS:
        // H'NG CHEW TENG 263117
        // LIM WEI YI 261307
        
        Scanner read = new Scanner(System.in);
        System.out.println("Input the annual interest rate: ");
         //Enter Annual Interest Rate
        double annualInterestRate = read.nextDouble();
        
        //Obtain Monthly Interest Rate
        double monthlyInterest = annualInterestRate/(12*100);
      
        System.out.println("Input the amount of the loan: ");
        //Enter Initial Loan Amount
        double loanAmount = read.nextDouble();
        
        System.out.println("Input the number of years loan amortized: ");
        //Number of years loan amortized
        int L = read.nextInt();
        
        //Number of months loan amortized
        int N = L*12;
        
        //Calculate Monthly Payment
        double line1 = loanAmount*monthlyInterest;
        double line2 = (1-Math.pow((1+monthlyInterest),-N));
        double monthlyPayment = line1/line2;
        
        //Output
        System.out.printf("The monthly payment for student loan is RM%.2f\n ",monthlyPayment);
    }
    
}
