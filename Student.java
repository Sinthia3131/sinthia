package student;
/*public class Student {
private static String university = "University of Liberal Arts";
private static int totalstudents = 0;
private int id;
private String name; 
private String department;
private double cgpa;
public Student (int id, String name, String department,double cgpa) {
this.id = id;
this.name = name;
this.department = department;
this.cgpa = cgpa;
totalstudents++;
}
public void display(){
System.out.println("ID:" + id);
System.out.println("Name:"+ name); 
System.out.println("Department:" + department);
System.out.println("CGPA:" + cgpa);
System.out.println("University:" + university);
System.out.println();
}
public static void totalstudents() {
System.out.println("Total Students:" + totalstudents); 
}
public static void main(String[] args) {
        Student student1= new Student(1, "Sumia", "Computer Science",3.50);
        Student student2 = new Student(2, "Sharmin", "Computer Science", 3.5);
        Student student3 = new Student(3, "Sinthia", "Computer Science", 3.9);

        
        student1.display();
        student2.display();
        student3.display();

        
       Student.totalstudents();
    }
}*/


/*import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static String university;
    private static int studentCount = 0;
    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }
    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter university name: ");
        university = scanner.nextLine();
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(id, name, department, cgpa);
        }
        for (Student student : students) {
            System.out.println("\nStudent Details:");
            student.displayDetails();
        }
        Student.displayStudentCount();
        scanner.close();
    }
}*/
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;

    private static String university = "Your University Name";
    private static int studentCount = 0;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }
    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for 3 students:");

        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter ID for student " + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.println("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.println("Enter department for student " + (i + 1) + ": ");
            String department = scanner.nextLine();

            System.out.println("Enter CGPA for student " + (i + 1) + ": ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            students[i] = new Student(id, name, department, cgpa);
        }

        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }

        Student.displayStudentCount();

        scanner.close();
    }
}

