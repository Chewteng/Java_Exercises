/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Chew Teng
 */
import java.util.Scanner;
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Body fat calculator
        Scanner read = new Scanner(System.in);
        
        char ans;
        int age;
        double weight, height, neck, waist, hip, bodyFat, fatMass, leanMass;
        
        //Sorted according to users' gender. 
        do{  
        System.out.print("Enter your gender: " + "[F=female, M=male] ==> ");
        ans = read.nextLine().charAt(0);
      
        if (ans!='F' && ans!='M')
        System.out.println("Wrong input. Please try again.\n");
        
        }while(!(ans=='F' || ans =='M'));
        
        //Get user input
        System.out.print("Please enter your age ==> ");
        age = read.nextInt();
        
        System.out.print("Please enter your weight in kg ==> ");
        weight = read.nextDouble();
        
        System.out.print("Please enter your height in cm ==> ");
        height = read.nextDouble();
        
        System.out.print("Please enter your neck size in cm ==> ");
        neck = read.nextDouble();
        
        System.out.print("Please enter your waist size in cm ==> ");
        waist = read.nextDouble();
        
        System.out.print("Please enter your hip size in cm ==> ");
        hip = read.nextDouble();
        
        //Calculate body fat percentage using formula
        if(ans == 'F'){
            bodyFat = (495/(1.29579-0.35004*Math.log10(waist+hip-neck)
                    +(0.22100*Math.log10(height))))-450;    
        }
        else{
            bodyFat = (495/(1.0324-0.19077*Math.log10(waist-neck)
                    +(0.15456*Math.log10(height))))-450;
        }
        
        System.out.println(" ");
        System.out.println("Result");
        System.out.printf("Body fat: %.1f%%\n", bodyFat);
        
        //Determine body fat categorization
        if(ans == 'F'){
            if(bodyFat>=10 && bodyFat<13.5)
                System.out.println("Body fat category: Essential fat.");
            else if (bodyFat>=13.5 && bodyFat<20.5)
                System.out.println("Body fat category: Athletes.");
            else if (bodyFat>=20.5 && bodyFat<24.5)
                System.out.println("Body fat category: Fitness.");
            else if (bodyFat>=24.5 && bodyFat<31.5)
                System.out.println("Body fat category: Average.");
            else
                System.out.println("Body fat category: Obese.");
        }
        
        else{
            if(bodyFat>=2 && bodyFat<5.5)
                System.out.println("Body fat category: Essential fat.");
            else if (bodyFat>=5.5 && bodyFat<13.5)
                System.out.println("Body fat category: Athletes.");
            else if (bodyFat>=13.5 && bodyFat<17.5)
                System.out.println("Body fat category: Fitness.");
            else if (bodyFat>=17.5 && bodyFat<25.5)
                System.out.println("Body fat category: Average.");
            else
                System.out.println("Body fat category: Obese.");
        }   
        
        //Calculate body fat mass(FM) using formula
        fatMass = (bodyFat/100)*weight;
        System.out.printf("Body fat mass: %.1fkgs\n", fatMass);
        
        //Calculate lean body mass(LM) using formula
        leanMass = weight-fatMass;
        System.out.printf("Lean body mass: %.1fkgs\n", leanMass);
       
    }
    
}
