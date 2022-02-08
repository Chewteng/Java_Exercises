/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author Chew Teng
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The statement to declare an object reference of type student
        //Student student1;
        
        /* The statement to create an object of type student and the declared object reference
        variable (student1) is set refering to this object*/
        //student1 = new Student();
        
        /*The statement to invoke the setProfile method from the student class 
        5 values of arguments are sent through this method to the created object only*/
        //student1.setProfile("AHMAD", "s1111", "IT", 2, 3.25);
                
        /*The statement to invoke the printProfile method from the student class 
        to print the details of the created student's object*/
        //student1.printProfile();
        
        Student student1 = new Student("Hanis","s111","IT");
        System.out.println("Name: "+student1.getName());
        System.out.println("Matric no: "+student1.getMatricNo());    
        System.out.println("Course: "+student1.getCourse());
    }
    
}
