package csc8023;

public class Main {
    public static void main(String[] args) {


        Book b1 = new Book("B1", "The Picture of Dorian Gray", 1890, 7.49);
        Book b2 = new Book("B2", "Pride and Prejudice", 1813, 9.99);
        Book b3 = new Book("B3", "Rebecca", 1938, 9.99);
        Book b4 = new Book("B4", "The Alchemist", 1988, 8.79);
        System.out.println(b1.getBookInfo());
        System.out.println(b2.getBookInfo());
        System.out.println(b3.getBookInfo());
        System.out.println(b4.getBookInfo());
    }
}