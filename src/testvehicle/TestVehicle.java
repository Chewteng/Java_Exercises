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
public class TestVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bus bus1 = new Bus("KAD1123", "Hino", "Mercedes");
        Car car1 = new Car("KCB3321", "Saga FLX", "Proton");
        
        System.out.println("Bus plate: "+bus1.getLicensePlate());
    }
    
}
