/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
import java.util.Arrays;
public class JavaApplication85 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner read = new Scanner(System.in);
        
        int [] array1 = {1,10,5,7};
        int [] array2 = {2,4,3,8};
        findLargestInTwoArrays (array1,array2);
        
       /* for(int i=0; i<array1.length; i++)
        {
         if(array1[0]<array1[i])
             array1[0] = array1[i];
        }
        System.out.println(array1[0]);
        */
    }
    
    public static void findLargestInTwoArrays(int arr1[],int[]arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(arr1[arr1.length-4] > arr2[arr2.length-4])
            System.out.println("The largest element is "+ arr1[arr1.length-4]);
        else
            System.out.println("The largest element is "+ arr2[arr2.length-4]);

     }
           
      
       
}
