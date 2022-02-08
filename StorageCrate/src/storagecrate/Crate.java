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
public class Crate {
    private String uniqueId;
    private String deliveryAddress;
    private String dateIn;
    private String ownerId;
    
    Crate(String uniId,String address,String date, String ownerId){
        this.uniqueId = uniqueId;
        this.deliveryAddress = deliveryAddress;
        this.dateIn = date;
        this.ownerId = ownerId;
    }
    
    public String getUniqueId (){
        return uniqueId;
    }
    
    public String getAddress(){
       return deliveryAddress; 
    }
    
    public String getDateIn(){
        return dateIn;
    }
    
    public String getOwnerId(){
        return ownerId;
    }
}
