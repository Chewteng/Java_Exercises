/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storagecrate;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class StorageCrate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Scanner read = new Scanner (System.in);
        
        System.out.print("Pls enter the number of crate: ");
        int numOfCrate = read.nextInt();
        
        Crate [] crate = new Crate [numOfCrate];
        for(int i=0; i<numOfCrate; i++){
            System.out.print("Pls enter unique ID of crate "+(i+1)+" : ");
            String uniqueId = read.next();
            System.out.print("Pls enter delivery address of crate "+(i+1)+" : ");
            String deliveryAddress = read.next();
            System.out.print("Pls enter date of crate "+(i+1)+" : ");
            String dateIn = read.next();
            System.out.print("Pls enter owner ID of crate "+(i+1)+" : ");
            String ownerId = read.next();
            crate [i] = new Crate(uniqueId, deliveryAddress, dateIn, ownerId);
        }
        
        for(int i=0; i<numOfCrate; i++){
            System.out.println("Unique ID "+(i+1)+" : "+crate[i].getUniqueId());
            System.out.println("Delivery address "+(i+1)+" : "+crate[i].getAddress());
            System.out.println("Date "+(i+1)+" : "+crate[i].getDateIn());
            System.out.println("Owner ID "+(i+1)+" : "+crate[i].getOwnerId());
        }*/
       
       Scanner read = new Scanner (System.in);
       System.out.print("Enter number of crate: ");
       int num = read.nextInt();
       read.nextLine();
       Crate [] crate = new Crate [num]; //object array using dynamic size
       
       for(int i=0; i<num; i++){
            System.out.println("############################################");
            System.out.println("Data: "+(i+1));
            System.out.print("Enter unique ID of crate: ");
            String uniqueId = read.nextLine();
            System.out.print("Pls enter delivery address of crate: ");
            String deliveryAddress = read.nextLine();
            System.out.print("Pls enter date of crate: ");
            String dateIn = read.nextLine();
            System.out.print("Pls enter owner ID of crate: ");
            String ownerId = read.nextLine();
            crate [i] = new Crate(uniqueId, deliveryAddress, dateIn, ownerId);
            System.out.println("############################################");
       }
       
       for(int i=0; i<24; i++){ // Clear Screen
           System.out.println("");
       }
       
       System.out.println("Object Data in Array");
       for(int i=0; i<num; i++){
           System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
           System.out.println("Data: "+(i+1));
           System.out.println("Unique ID : "+crate[i].getUniqueId());
           System.out.println("Delivery address: "+crate[i].getAddress());
           System.out.println("Date: "+crate[i].getDateIn());
           System.out.println("Owner ID: "+crate[i].getOwnerId());
           System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       }
       
       
       
       
       
    }
    
}
