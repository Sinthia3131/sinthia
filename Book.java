package book;
import java.util.ArrayList;

class Book {
    String title;
    String author;
    int year;
    String genre;

    Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Genre: " + genre;
    }
}

public class BookManager {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee",1960, "Fiction");
        Book book3 = new Book("1984", "George Orwell", 1949, "Science Fiction");

        // Store objects in an ArrayList
        ArrayList bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        // Display all books
        System.out.println("All Books:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // Remove a particular book
        bookList.remove(1); // Remove the book at index 1 (To Kill a Mockingbird)

        // Display remaining books
        System.out.println("\nRemaining Books:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
