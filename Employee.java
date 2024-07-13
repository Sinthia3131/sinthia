package employee;
//public class Employee() {
/*public static String company_name = "University of Liberal Arts";
public static String company_location="Beribadh road, Mohammadpur, Dhaka";
public static int totalemploy=0;
public String name;
public int age;
public String designation;
public double salary;
public Employee (String name, int age, String designation, double salary) {
this.name =name;
this.age=age;
this.designation=designation;
this.salary =salary;
totalemploy++;
}
void display () {
System.out.println("Employee Name:" + name);
System.out.println("Age:" + age);
System.out.println("Designation:" + designation);
System.out.println("Salary: $" + salary);
System.out.println("Company Name:" + company_name);
System.out.println("Company Address:" + company_location);
System.out.println();
}
public static void totalemploy () {
System.out.println("total Employee: "+totalemploy);
}

public static void main(String[] args) {
Employee employee1 = new Employee ("Sakib Mahmud", 28, "Teacher", 100000);
Employee employee2 = new Employee ("Rakib hasan", 40, "Accountant", 50000);
Employee employee3 = new Employee ("Golam kibria", 36, "Dean", 170000);
employee1.display();
employee2.display();
employee3.display();
totalemploy();
}
}*/
import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    private static String companyName;
    private static String companyAddress;
    private static int employeeCount = 0;

    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        employeeCount++;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
    }
    public static void displayEmployeeCount() {
        System.out.println("Total number of employees: " + employeeCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter company name: ");
        companyName = scanner.nextLine();

        System.out.print("Enter company address: ");
        companyAddress = scanner.nextLine();

        Employee[] employees = new Employee[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter employee age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter employee designation: ");
            String designation = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            employees[i] = new Employee(name, age, designation, salary);
        }

        for (Employee employee : employees) {
            System.out.println("\nEmployee Details:");
            employee.displayDetails();
        }

        Employee.displayEmployeeCount();
        scanner.close();
    }
}

