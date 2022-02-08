/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookinfo;

/**
 *
 * @author Chew Teng
 */
public class BookInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Book book1 = new Book("The Power of Habit", "Chareen");
     System.out.println("Book Title: "+book1.getBookTitle());
     System.out.println("Book Owner: "+book1.getOwner());
             
     book1.setNewOwner("Hanis","abcd"); //if u want to change to new owner
     System.out.println("Book Title: "+book1.getBookTitle());
     System.out.println("Book Owner: "+book1.getOwner());  
        
        
    }
    
}
