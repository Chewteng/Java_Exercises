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
public class DeliveryTruck {
    
    private String type;
    private String regNo;
    private double speed;
    
    public DeliveryTruck(String type, String regNo, double speed){
        this.type = type;
        this.regNo = regNo;
        this.speed = speed;
    }
    
    public String getType(){
        return type;
    }
    
    public double getSpeed(){
        return speed;
    }
    
    public String getRegNo(){
        return regNo;
    }
}
