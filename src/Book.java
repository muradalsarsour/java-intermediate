/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class  Book implements Display {
    private String title ;
    private Author author;
    private int number;
    private String genre;
    private int version;
    private Date date;
    private boolean onloan;

    public Book() {
    }

    public Book(String title, Author author, int number, String genre, int version, Date date) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.genre = genre;
        this.version = version;
        this.date = date;
        this.onloan =false ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getInfo(){
        return"Book:"+title+"by "+author.getName()+"\nGenre:"+genre+"\nVersion:"+version;
    }
  
    @Override
    public boolean inLoan() {
        return onloan;
    }
    

    public void setOnloan(boolean onloan) {
        this.onloan = onloan;
    }
    
    
    
    
    
}
