
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
public class Car {
    
    private String cartype, regno;
    
    Car(String type, String rno){
        cartype = type;
        regno = rno;
    }
    
    String getCarType(){
        return cartype;
    }
    
    String getRegNo(){
        return regno;
    }
    
    void setnewCarType(String newcartype){
        cartype=newcartype;
    }
    
}
