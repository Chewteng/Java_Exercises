/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleexception;

import java.util.Scanner;

/**
 *
 * @author Chew Teng
 */
public class SampleException {

   static void validateInput(int number) throws InvalidInputException{
       if(number>100){
           throw new InvalidInputException();
       }
       System.out.println("Valid Input");
   }
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number less than 100: ");
        int number = scan.nextInt();
        try{
            validateInput(number);
        }
        catch(InvalidInputException e){
            System.out.println("Caught exception - Input is greater than 100");
        }
    }
    
}
