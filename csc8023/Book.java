package csc8023;

//class
public class Book {


    //fields
    private String bookID;
    private String title;
    private int yearPublished;
    private double price;

    //constructor
    public Book(String bookID, String title, int year, double price) {
        this.bookID = bookID;
        this.title = title;
        this.yearPublished = year;
        this.price = price;

    }

    //String bookInfo = new String(bookID + title, yearPublished, price);

    public String getBookInfo () {
        String bookInfo = "ID: " + bookID + "\n" + "Title: " + title + "\n" + "Year published: " + yearPublished + "\n" + "Price: " + price;
        //return bookID;
        //return title;
        //return yearPublished;
        //return price;
        return bookInfo;

        //below trying to print all book names for window


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
}