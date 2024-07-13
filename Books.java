package books;
/*public class Books {
public static String genre ="Novel";
public static int totalbooks=0;

   private static void totalBooks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public String title;
public int year;
public String author;
public Books (String title, int year, String author) {
this.title=title;
this.year=year;
this.author=author;
totalbooks++;
}
void display() {
System.out.println("book title:" +title);
System.out.println("release year:" + year);
System.out.println("writer:" + author);
System.out.println("genre:" + genre);
System.out.println();
}
public static void totalbooks() {
System.out.println(" Number of books: "+totalbooks);
}

public static void main(String[] args) {
Books b1 = new Books("pather panchali",1929, "Bibhutibhushan Bandyopadhyay");
Books b2 = new Books("Dipu number 2", 1996, "Muhammed Zafar Iqbal");
Books b3 = new Books("Sheser Kabita", 1928, "Rabindranath Tagore");
b1.display();
b2.display();
b3.display();

totalBooks();

}

}*/
import java.util.Scanner;

public class Books {
    private String title;
    private String author;
    private int year;

    private static String genre;
    private static int bookCount = 0;

    public Books(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publication Year: " + year);
        System.out.println("Book Genre: " + genre);
    }

    public static void displayBookCount() {
        System.out.println("Total number of books: " + bookCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book genre: ");
        genre = scanner.nextLine();
        Books[] books = new Books[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");

            System.out.print("Enter book title: ");
            String title = scanner.nextLine();

            System.out.print("Enter book author: ");
            String author = scanner.nextLine();

            System.out.print("Enter publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            books[i] = new Books(title, author, year);
        }
        for (Books book : books) {
            System.out.println("\nBook Details:");
            book.displayDetails();
        }
        Books.displayBookCount();
        scanner.close();
    }
}

