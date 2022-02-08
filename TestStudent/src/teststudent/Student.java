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
public class Student {
    //data fields/instance variables declaration
    private String name, matricNo, course;
    private int semester;
    private double cgpa;
    
    //method declaration and definition
    /*void setProfile(String nm, String matric, String cr, int sem, double CGPA){
        name = nm;
        matricNo = matric;
        course= cr;
        semester = sem;
        cgpa = CGPA;
    }
    
    void printProfile(){
        System.out.println("Name : "+name);
        System.out.println("Matric no : "+matricNo);
        System.out.println("Course : "+course);
        System.out.println("Semester : "+semester);
        System.out.println("CGPA : "+cgpa);
    }
*/
    Student (String nm, String mt, String cr){
        name = nm;
        matricNo = mt;
        course = cr;
    }
    
    String getName(){
        return name;
    }
    
    String getMatricNo(){
        return matricNo;
    }
    
    String getCourse(){
        return course;
    }
            
}
