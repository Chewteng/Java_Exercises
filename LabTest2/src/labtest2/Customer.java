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
public class Customer {
    
    private String name;
    private String orderNumber;
    private String phoneNumber;
 
    public Customer(String nm, String orderNo, String phoneNo){
        name = nm;
        orderNumber = orderNo;
        phoneNumber = phoneNo; 
    }
    
    public String getName(){
        return name;  
    }
    
    public String getOrderNumber(){
        return orderNumber;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }

}