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

    }

}