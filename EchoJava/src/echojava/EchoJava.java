/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echojava;

/**
 *
 * @author Chew Teng
 */

import java.util.Scanner;
public class EchoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a line of text: ");
        String message;
        message = scan.nextLine();
        
        System.out.println(" You entered:" + message);
        
        
        
        
    }
    
}
