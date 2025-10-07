package csc8023;
import java.util.ArrayList;
import java.util.List;

//class
public class BookStoreWindow {

    //fields
    String bookStoreName;
    String bookStoreAddress;
    List<Book> booklistArray;

    //constructor
    public BookStoreWindow(String bookStoreName, String bookStoreAddress, List<Book> books) {
        this.bookStoreName = bookStoreName;
        this.bookStoreAddress = bookStoreAddress;
        this.booklistArray = books;
//        for (int i = 0; i < books.length; i++) {
//            booklistArray[i] = new ArrayList<>();
//        }

    }
    //getting maxPrice below
    public double  maxPrice() {
        double maxPrice = 0;
        for (int i = 0; i < booklistArray.size(); i++) {
            if (booklistArray.get(i).getPrice() > maxPrice) {
                maxPrice = booklistArray.get(i).getPrice();
            }
        }
        return maxPrice;
    }
    // representing the oldest book
    public Book oldestBook() {
        int oldestBook = 0;
        for (int i = 0; i < booklistArray.size(); i++) {
            if (booklistArray.get(i).getYearPublished() < booklistArray.get(oldestBook).getYearPublished()) {
                oldestBook = i;
            }
        }
        return booklistArray.get(oldestBook);
    }





}
