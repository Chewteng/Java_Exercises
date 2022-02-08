/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarandomclassexample;

/**
 *
 * @author Chew Teng
 */
import java.util.Random;
public class JavaRandomClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Create a random number that is greater than or equal to 0, and less than 100.
        (Ii is set to run 20 tests.)*/
        
        int numTests = 20; //run 20 random examples
        Random random = new Random();
        for (int i=0; i<numTests; i++){
            //int randomInt = random.nextInt(100);
            System.out.print(random.nextInt(100) + " ");
            
        }
        System.out.println(" ");
    }
    
}
