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
public class Loan {
    private Date duedate;
    private Student student;
    private List<Book>books;

    public Loan() {
    }

    public Loan(Date duedate, Student student) {
        this.duedate = duedate;
        this.student = student;
        this.books=new ArrayList<>();
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    
    
}
