/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrangeelements;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class ArrangeElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arranging elements in the order.
        Scanner data= new Scanner(System.in);
        int value[]= new int[5];
        int temp,i,j;
        
        //System.out.println("Enter 5 element of array");
        for(i=0;i<5;i++)
        {
        System.out.print("Enter " + (i+1)+ " element of array: ");    
        value[i]=data.nextInt();
        }
        
        for(i=0;i<5;i++)
        {
           for(j=i;j<5;j++)
           {
              if(value[i]>value[j])
              {
                temp=value[i];
                value[i]=value[j];
                value[j]=temp;
              }
           }

         }
        
        System.out.println("Increasing Order: ");
        
        for(i=0;i<5;i++)
           System.out.println(" "+value[i]); 
        }
    }
    

