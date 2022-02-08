/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

/**
 *
 * @author 
 */

// Group members:
// LIM WEI YI     (261307)
// H'NG CHEW TENG (263117)

import java.util.Scanner;

public class FinalProject {

    /**
     * @param args the command line arguments
     */
    
    public static char ans;
    public static int i, j;
    public static double totalPrice, grandTotal=0.0;
    public static double amount, balance;
    
    public static void main(String[] args) {
  
        welcome();
        
        Scanner read = new Scanner(System.in);
        System.out.printf("Grand total: RM%.2f\n\n ",grandTotal);
        double credit =calcPayment(grandTotal);
  
        System.out.println(" ");
        
        System.out.println("Your Bill: ");
        System.out.println("********************************************");
        System.out.printf("%-30s RM %.2f\n", "Total Price : ", grandTotal);
        System.out.printf("%-30s RM %.2f\n", "Amount Tendered : ", amount);
        System.out.printf("%-30s RM %.2f\n", "Balance : ", credit);
    }
    
    public static void welcome(){
        // The list of cakes sold by JavaBeans Bakery Sdn.Bhd.
        String cake[] = {"New York Cheese" ,"Black Forest Cheese", "Red Velvet",
                         "Fruitilicious","Carrot Walnut","Chocolate Indulgence",
                         "Raspberry Cheese" ,"Brownies Walnut" ,"Durian Cheese", 
                         "Hi-Fibre Cream Cheese"};
        
        //The prices of the cakes sold by JavaBeans Bakery Sdn.Bhd.
        double price[] = {88.00, 88.00, 130.00, 130.00, 36.00, 78.00, 106.00, 
                          158.00, 120.00, 98.00}; 
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("***************************");
        System.out.println("WELCOME TO JAVABEANS BAKERY");
        System.out.println("***************************");
       
        do{
        //The cakes' menu that sorted ascendingly according to user preferred.   
        System.out.println("There are two types of menu. ");
        System.out.println("Which menu you preferred to look at: "
                + "[A=cakeName, B=cakePrice] ==> ");
        ans = read.nextLine().charAt(0);
      
        if (ans!='A' && ans!='B')
        System.out.println("Wrong input. Please try again. \n");
         
        }while(!(ans=='A' || ans =='B'));
        
        //Price Ascending order 
        System.out.print("\n");
        
        if(ans=='A')
        for(i=0; i<cake.length;i++){
            for(int j=i+1; j<cake.length;j++){        
                if (cake[i].compareTo(cake[j])>0){
                    String s = cake[i];
                    cake[i]=cake[j];
                    cake[j]=s;
                 
                    double temp = price[i];
                    price[i]=price[j];
                    price[j]=temp;
                
        	}
            }
        } 
        else
            for(i=0; i<cake.length;i++){
            for(int j=i+1; j<price.length;j++){
        	if(price[i]>price[j]){
        		double temp = price[i];
        		price[i]=price[j];
        		price[j]=temp;
                    
        		String s = cake[i];
        		cake[i]=cake[j];
        		cake[j]=s;
                        
                }      
            }
        }
        
        for (int i = 0; i< cake.length ; i++)
        {
            System.out.printf("%d. %-30s %-8.2f \n", (i+1), cake[i], price[i]);
        }            
        System.out.println(" ");
        
        int choice,quantity;
        
        //Ask customer to choose their preferred cake
        System.out.println("Welcome my dear. Which cake do you preferred? ");
        System.out.print("Enter the number of cake in the cake list ==> ");
        choice = read.nextInt();  
        
        System.out.print("State the quantity of cake you want ==> ");
        quantity = read.nextInt();
        
        //Display the current total price
        totalPrice = price [choice-1] * quantity;
        grandTotal += totalPrice;
        System.out.printf("Current total price: RM%.2f\n ",grandTotal);
        System.out.println(" ");
        
        //Ask customer whether want to add order or not
        System.out.print("Do you want to add more to your order [Y/N]: ");
        ans = read.next().charAt(0);
        System.out.println(" ");
        
       if (ans=='Y' || ans=='y')
        welcome();
       
    }
   
    public static double calcPayment (double balance)
    {
        Scanner read = new Scanner (System.in);
        System.out.printf("Please enter amount tendered: RM ");
        amount = read.nextDouble();
        
        balance = amount - grandTotal;
        return balance;
    }
}
    

