/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.flowchart;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class ProgramFlowchart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = read.nextInt();
        
        if(num>0){
        
            if(num%2==0){
            System.out.println("Even");
            }else{
            System.out.println("Odd");
            }
        
        }else{
            System.out.println("Pls input a number greater than zero.");
        }
        
        
              
              
              
                
                
        
        
    }
    
}
