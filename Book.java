/*package book;

import java.util.ArrayList;
//import java.util.Objects;

/*import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int year;
    private static String genre;
    private static int bookCount = 0; 
    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        Book.genre = genre; 
        bookCount++;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + bookCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter genre for all books: ");
        String genre = scanner.nextLine();

      
        System.out.print("Enter title of book 1: ");
        String title1 = scanner.nextLine();
        System.out.print("Enter author of book 1: ");
        String author1 = scanner.nextLine();
        System.out.print("Enter year of book 1: ");
        int year1 = scanner.nextInt();
        scanner.nextLine();
        Book book1 = new Book(title1, author1, year1, genre);

        System.out.print("Enter title of book 2: ");
        String title2 = scanner.nextLine();
        System.out.print("Enter author of book 2: ");
        String author2 = scanner.nextLine();
        System.out.print("Enter year of book 2: ");
        int year2 = scanner.nextInt();
        scanner.nextLine();
        Book book2 = new Book(title2, author2, year2, genre);

        System.out.print("Enter title of book 3: ");
        String title3 = scanner.nextLine();
        System.out.print("Enter author of book 3: ");
        String author3 = scanner.nextLine();
        System.out.print("Enter year of book 3: ");
        int year3 = scanner.nextInt();
        scanner.nextLine(); 
        Book book3 = new Book(title3, author3, year3, genre);

      
        System.out.println("\nBook 1 details:");
        book1.displayBookDetails();
        System.out.println("\nBook 2 details:");
        book2.displayBookDetails();
        System.out.println("\nBook 3 details:");
        book3.displayBookDetails();
        Book.displayTotalBooks();
    }
}*/
/*public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   public String getAuthor() {
       return author; 
   }
    
   public void setAuthor(String author) { 
       this.author=author; 
   }
   
   public int getYear() { 
       return year; 
   }
   
   public void setYear(int year) { 
       this.year=year;  
   }
    
  public String getGenre() {  
      return genre;  
  }
    
  public void setGenre(String genre) {  
      this.genre=genre;  
  } 

/*@Override
public boolean equals(Object obj){
if (this == obj)
return true;

if (obj == null || getClass() != obj.getClass())
return false;

Book book=(Book)obj ;

return (title.equals(book.title));
}

//@Override
public int hashCode(){
return Objects.hash(title);
}

//@Override
public String toString(){
return "Title: "+title+", Author: "+author+", Year: "+year+", Genre: "+genre ;
}
}*/


//import java.util.ArrayList;


/*class Main{
    	public static void main(String[] args){
        	// Create Book objects using the parameterized constructor
   Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 196, "Fiction");
   Book book2 = new Book("1984", "George Orwell", 1949, "Science Fiction");
   Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction");

   // Store the objects in an array
   ArrayList booksList = new ArrayList<>();
   booksList.add(book1);
   booksList.add(book2);
   booksList.add(book3);

    // Display the objects
    System.out.println("Original List of Books: ");
    for(Object b : booksList) {
        System.out.println(b);
    }

    // Remove a particular object (book2)
    boolean removed = booksList.removeIf(b -> b.equals(book2));

     if(removed){
     System.out.println("\nBook Removed Successfully\n");
      } else {
       System.out.println("\nBook Not Found and Not Removed\n"); 
       }
     
     // Display the remaining objects after removal
     System.out.println("\nRemaining List of Books: ");
     for(Object b : booksList) {
        System.out.println(b);
     }
    }
}
}*/
/*package arrayobjects;

import java.util.ArrayList;

public class Book {
private String title;
private String author;
private int year;
private String genre;
public Book (String title, String author, int year, String genre) {
this.title = title;
this.author = author;
this.year = year;
this.genre = genre;
}
public void displayDetails() {
System.out.println("Title:" + title);
System.out.println("Author: " + author);
System.out.println("Year:" + year);
System.out.println("Genre:" + genre);
System.out.println();
}
}
/*public class main{
    	public static void main(String[] args){
        	// Create Book objects using the parameterized constructor
   Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 196, "Fiction");
   Book book2 = new Book("1984", "George Orwell", 1949, "Science Fiction");
   Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction");

   // Store the objects in an array
   ArrayList booksList = new ArrayList<>();
   booksList.add(book1);
   booksList.add(book2);
   booksList.add(book3);

    // Display the objects
    System.out.println("Original List of Books: ");
    for(Object b : booksList) {
        System.out.println(b);
    }

    // Remove a particular object (book2)
    boolean removed = booksList.removeIf(b -> b.equals(book2));

     if(removed){
     System.out.println("\nBook Removed Successfully\n");
      } else {
       System.out.println("\nBook Not Found and Not Removed\n"); 
       }
     
     // Display the remaining objects after removal
     System.out.println("\nRemaining List of Books: ");
     for(Object b : booksList) {
        System.out.println(b);
     }
    }
}


/*package arrayobjects;
//public class ArrayOfObjects {
/*public static void main(String[] args) {
Book[] books = new Book[3];
// Initialize objects using the parameterized constructor
books [0] = new Book( "Book 1",  "Author 1", 2020,  "Fiction");
books [1] = new Book( "Book 2",  "Author 2",  2018,"Thriller");
books [2] = new Book( "Book 3", "Author 3", 2015,"Mystery");
System.out.println( "Initial Book Details:");
for (Book book books) {
    book.displayDetails();
}
// Remove an object by assigning null
    books [1] = null;
    
    System.out.println( "Book Details after Removing an Object:");
    for (Book book books) {
        if (book != null) {
            book.displayDetails();
}
}
}*/
package book;
public class Book {
public static String genre ="Novel";
public static int totalbooks=0;

   private static void totalBooks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public String title;
public int year;
public String author;
public Book (String title, int year, String author) {
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
Book b1 = new Book("pather panchali",1929, "Bibhutibhushan Bandyopadhyay");
Book b2 = new Book("Dipu number 2", 1996, "Muhammed Zafar Iqbal");
Book b3 = new Book("Sheser Kabita", 1928, "Rabindranath Tagore");
b1.display();
b2.display();
b3.display();

totalBooks();

}

}