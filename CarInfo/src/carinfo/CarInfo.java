/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinfo;

/**
 *
 * @author Chew Teng
 */
public class CarInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Car car1 = new Car("Proton X70", "KDF3332");
     System.out.println("Car Type: "+car1.getCarType());
     System.out.println("Book Owner: "+car1.getRegNo());
         
     car1.setnewCarType("Myvi");
     System.out.println("Car Type: "+car1.getCarType());
     System.out.println("Book Owner: "+car1.getRegNo());
    }
    
}
