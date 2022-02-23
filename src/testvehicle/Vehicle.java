/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvehicle;

/**
 *
 * @author Chew Teng
 */
public class Vehicle {
    private String licensePlate,model,maker;
    
    public Vehicle(String licensePlate, String model, String maker){
        this.licensePlate = licensePlate;
        this.model = model;
        this.maker = maker;
    }
    
    String getLicensePlate(){ //want to get license plate 
        return licensePlate;  //write once inside parent and use it everywhere(dont have to repeat in child class)
    }
    
    String getModel(){
        return model;
    }
    
    String getMaker(){
        return maker;
    }
}
    
