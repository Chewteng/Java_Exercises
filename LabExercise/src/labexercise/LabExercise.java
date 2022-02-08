/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise;


import java.util.Scanner;
public class LabExercise {
    
    
    public static char ct ; //global variable
    public static String result; // global variable
            
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a character between A-D: ");
        ct = read.nextLine().charAt(0);
        switchStatement();
        
        System.out.println("The input data is "+ ct);
        System.out.println("The result outcome is "+result);
        
    }
    
    public static void switchStatement(){
    
        switch(ct)
        {
        case 'A' : result ="Apple";
            break;
        case 'B' : result ="Ball";
            break;
        case 'C' : result = "Cat";
            break;
        case 'D' : result = "Donkey";
            break;
        default  : result = "Wrongly Input";
            break;
        }
    }
}
