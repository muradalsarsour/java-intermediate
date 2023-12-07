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
public class Student {
    private int id;
    private String name;
    private String address;
    private Date birthdate;
    private String major;
    private List<Book>borrowedBooks;

    public Student() {
    }

    public Student(int id, String name, String address, Date birthdate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        this.major = major;
        this.borrowedBooks = new ArrayList<>();
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public boolean canBorrow(){
        return borrowedBooks.size()<3;
    }
    
    public void borrowBook(Book book){
        if(canBorrow()){
            borrowedBooks.add(book);
            book.setOnloan(true);
            System.out.println((name+" borrowed the book->"+book.getInfo()));
        }
        else {
            System.out.println(name+"has already borrowed 3 books and cannot borrow more.");
        }
    }
    
    public void returnBook(Book book){
        borrowedBooks.remove(book);
        book.setOnloan(false);
        System.out.println(name+"returned the book :"+book.getInfo());
    }
}
