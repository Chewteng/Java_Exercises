/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylearning;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class ArrayLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int arrayLength=4 , 
                flag=0;
        String [] mobileBrand = {"iPhone","Samsung","Oppo","Lenovo"};
        System.out.print("Enter the mobile phone brand that you want to search:"); 
        String searchBrand = input.nextLine();
        for (int i = 0; i < arrayLength ; i++) { 
            if(mobileBrand[i].equals(searchBrand)) { 
                 System.out.println("You Searched for "+ mobileBrand[i] + ", it is in index " +i); 
                 System.out.print("Enter the new brand that you want to replace with " + searchBrand + ": "); 
                 String updateBrand = input.nextLine(); 
                 mobileBrand[i] = updateBrand; 
                 System.out.println("You replaced with "+mobileBrand[i]+"");
            flag = 1; 
            break; 
    } 
        }//for
            if(flag==0) 
                System.out.println("The brand does not exist");

    }
    
}
