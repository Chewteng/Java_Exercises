/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Chew Teng
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int num[] = {75,23,11,17,13,62,36,78,43,101};
        System.out.println(num[3]);
        num[3] = 15;
        System.out.println("Index 3 ==> "+num[3]);
        int jum = num[3] + num[5];
        System.out.printf("Content of index 3 + index 5 = %d%n",jum);
        
        for(int i=0; i<10; i++){ //Loop from 0 to 9
            num[i] = 5; //num at the location 0, store 5
                        //num at the location 1, store 5
                        //num at the location 2, store 5
        }
        System.out.println("After Looping: ");
        System.out.println(num[3]);
        System.out.println(num[5]);
        */
       
        int [] num = {16,19,0,3,0,9,9};
        int size = num.length;
        System.out.print("The size of array is: "+size);
        System.out.println("");
        
        String [] comBrand = {"Asus","Acer","Sony","Lenovo","HP"};
        System.out.println("The size of array is "+comBrand.length);
        System.out.println("The computer brand in index[3] is > "+comBrand[3]);
        
        for(int j=0;j<comBrand.length;j++){
            
            System.out.printf("The value of index %d is %s\n ", j, comBrand[j]);
        }
        
                
    }
    
}
