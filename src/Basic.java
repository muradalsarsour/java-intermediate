/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 // muradalsarsour

/**
 *
 * @author HP
 */
public class Basic {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library library=new Library();
        Book book1=new Book("home",new Author(1,"jone","new yourk",new Date(1,2,1998)),10,"sdf",1,new Date(1,1,2020));
        library.addBook(book1);
        library.checkAvailability(book1);
        library.displayBooks();
    }
       
    
}
