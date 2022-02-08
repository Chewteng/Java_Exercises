/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest2;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class LabTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // H'NG CHEW TENG (263117)
        
        Scanner read = new Scanner(System.in);
        
        String input;
        String c = "customer";
        String d = "driver";
        String t = "truck";
        
        do{
        System.out.println("There are three information can be obtained.");
        System.out.println("To access driver information, pls enter driver or");
        System.out.println("To access customer information, pls enter customer or");
        System.out.println("To access delivery truck information, pls enter truck.");
        System.out.print("Pls enter ==> ");
        input = read.next();
    
        //Customer Information
        if(input.equals(c)){
        int numCustomer = 5;
        Customer [] customer = new Customer [numCustomer];

        for(int i=0; i<numCustomer; i++){
            System.out.println("#############################################");
            System.out.println("Data "+(i+1)+": ");
            System.out.print("Enter the name of customer: ");
            String nm= read.next();
            System.out.print("Enter the order number of customer: ");
            String orderNo= read.next();
            System.out.print("Enter the phone number of customer: ");
            String phoneNo= read.next();
            customer[i] = new Customer(nm,orderNo,phoneNo); 
            System.out.println("#############################################");
        }
        
        System.out.println("\n\n"+"The customer informations are: ");
        for(int i=0;i<numCustomer; i++){
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Customer "+(i+1)+ ": ");
            System.out.println("Name: "+customer[i].getName());
            System.out.println("Order Number: "+customer[i].getOrderNumber());
            System.out.println("Phone Number: "+customer[i].getPhoneNumber());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
       }
        
        //Driver information
        else if(input.equals(d)){
        Driver [] driver = new Driver [3];

        for(int index=0; index<3; index++){
            System.out.println("#############################################");
            System.out.println("Data "+(index+1)+": ");
            System.out.print("Enter the name driver: ");
            String name= read.next();
            System.out.print("Enter the workerID driver: ");
            String workerId= read.next();
            System.out.print("Enter the age driver: ");
            int age= read.nextInt();
            driver[index] = new Driver(name,workerId,age); 
            System.out.println("#############################################");
        }
       
        System.out.println("\n"+"The driver informations are: ");
        for(int index=0;index<3; index++){
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Driver "+(index+1)+ ": ");
            System.out.println("Name: "+driver[index].getName());
            System.out.println("Worker ID: "+driver[index].getWorkerId());
            System.out.println("Age: "+driver[index].getAge());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
        System.out.println("");
        
        //New driver is added
        System.out.print("New driver added by typing YES or NO ==> ");
        String ans = read.next();
        String yes = "YES";
        
        if(ans.equals(yes)){
        System.out.print("How many new driver is added: ");
        int newDriverNo = read.nextInt();
        System.out.println("");
        
        Driver [] newdriver = new Driver[newDriverNo];
        
        for(int index=0; index<newDriverNo; index++){
            System.out.println("*********************************************");
            System.out.println("Data "+(index+1)+": ");
            System.out.print("Enter the new driver name: ");
            String name= read.next();
            System.out.print("Enter the new driver worker ID: ");
            String workerId= read.next();
            System.out.print("Enter the new driver age: ");
            int age= read.nextInt();
            newdriver[index] = new Driver(name,workerId,age); 
            System.out.println("*********************************************");
        }
        
        System.out.println("The new driver informations are: ");
        for(int index=0; index<newDriverNo; index++){
            System.out.println("New driver "+(index+1)+ ": ");
            System.out.println("Name: "+newdriver[index].getName());
            System.out.println("Worker ID: "+ newdriver[index].getWorkerId());
            System.out.println("Age: "+ newdriver[index].getAge());
        }    
       } 
      }
        
        //Delivery Truck Information
        else if(input.equals(t)) {
        DeliveryTruck [] truck = new DeliveryTruck [4];

        for(int i=0; i<4; i++){
            System.out.println("#############################################");
            System.out.println("Data "+(i+1)+": ");
            System.out.print("Enter the type of delivery truck: ");
            String type= read.next();
            System.out.print("Enter the speed of delivery truck: ");
            double speed = read.nextDouble();
            System.out.print("Enter the registration number of delivery truck: ");
            String regNo= read.next();
            truck[i] = new DeliveryTruck(type,regNo,speed); 
            System.out.println("#############################################");
        }
        
        System.out.println("\n\n"+"The delivery truck informations are: ");
        for(int i=0;i<4; i++){
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Delivery Truck "+(i+1)+ " : ");
            System.out.println("Type: "+truck[i].getType());
            System.out.println("Speed: "+truck[i].getSpeed());
            System.out.println("Registration Number: "+truck[i].getRegNo());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
       } 
        
        else{
            System.out.println("Invalid input! Enter again.");
            System.out.println("");
        }
        
      }while(!(input.equals(c)) && !(input.equals(d)) && !(input.equals(t)));
        
    }
}
