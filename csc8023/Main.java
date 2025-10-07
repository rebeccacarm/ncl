package csc8023;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Book b1 = new Book("B1", "The Picture of Dorian Gray", 1890, 7.49);
        Book b2 = new Book("B2", "Pride and Prejudice", 1813, 9.99);
        Book b3 = new Book("B3", "Rebecca", 1938, 12.99);
        Book b4 = new Book("B4", "The Alchemist", 1988, 8.79);
        System.out.println(b1.getBookInfo());
        System.out.println(b2.getBookInfo());
        System.out.println(b3.getBookInfo());
        System.out.println(b4.getBookInfo());

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        // getting the info from the book in the list
        System.out.println(books.get(2).getBookInfo());

        BookStoreWindow bookStoreWindow = new BookStoreWindow("Rebecca's books", "An address", books);
        System.out.println(bookStoreWindow.maxPrice());
        System.out.println(bookStoreWindow.oldestBook().getBookInfo());

    }
}