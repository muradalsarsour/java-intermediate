/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class Library {
    private List<Book> books;
    
    public Library(){
        books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public Book searchBookbyTitle(String title){
        for(Book book:books){
            if(book.getTitle().equals(title))
                return book;
        }
        return null;
    }
    
    public boolean checkAvailability(Book book){
        return !book.inLoan();
    }
    
   public void displayBooks(){
       for(Book book:books){
           System.out.println(book.getInfo());
       }
   }
        
}
