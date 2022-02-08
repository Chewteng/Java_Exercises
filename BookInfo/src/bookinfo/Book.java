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
public class Book {
    private String bookTitle, owner;
    
    Book(String title, String bookowner){ //constructor
        bookTitle= title;
        owner = bookowner;
    }
    
    String getBookTitle(){//getter method
        return bookTitle;
    }    
    
    String getOwner(){//getter method
        return owner;
    }
    
    void setNewOwner(String newowner, String newbooktitle){//setter method
        owner = newowner;
        bookTitle = newbooktitle;
    }
    
}
