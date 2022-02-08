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
public class Driver {
    
    private String name,workerId;
    private int age;
    
   public Driver(String name, String workerId, int age){
        this.name = name;
        this.workerId = workerId;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public String getWorkerId(){
        return workerId;
    }
    
    public int getAge(){
        return age;
    }
    
    void setNewName(String newName, String newWorkerId, int newAge){
        name = newName;
        workerId = newWorkerId;
        age = newAge;
    }
    
    
}
