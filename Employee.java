package employee;
public class Employee {
   
    private String name;
    private int id;
    private double salary;
    private String designation;

   
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
      
        Employee emp = new Employee("John Doe", 101, 50000.0, "Software Engineer");

        emp.displayEmployeeDetails();
        emp.setName("Jane Smith");
        emp.setSalary(60000.0);
        emp.setDesignation("Senior Software Engineer");

        emp.displayEmployeeDetails();
    }
}
/*public class Employee {
    // Properties
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Default Constructor
    public Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
        this.designation = "Not assigned";
    }

    // Parameterized Constructor (Constructor Overloading)
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0.0;
        this.designation = "Not assigned";
    }

    // Another Parameterized Constructor (Constructor Overloading)
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Getter and Setter methods (Using 'this' keyword)

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method Overloading
    public void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
    }

    public void display(boolean showSalary) {
        display(); // Call the basic display method
        if (showSalary) {
            System.out.println("Salary: " + this.salary);
            System.out.println("Designation: " + this.designation);
        }
    }

    public static void main(String[] args) {
        // Using default constructor
        Employee emp1 = new Employee();
        emp1.display();

        System.out.println();

        // Using parameterized constructor with name and id
        Employee emp2 = new Employee("John", 101);
        emp2.display();

        System.out.println();

        // Using parameterized constructor with all properties
        Employee emp3 = new Employee("Alice", 102, 60000, "Manager");
        emp3.display(true); // Show full details including salary and designation
    }
}
/*public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor overloading
    Employee() {
        // Default constructor
    }

    Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Method overloading
    public double calculateSalary() {
        return salary;
    }

    public double calculateSalary(double bonus) {
        return salary + bonus;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
        System.out.println("Designation: " + designation);
    }
}

// Example usage
//public class Main {
    public static void main(String[] args) {
        // Creating an Employee object using the default constructor
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setId(1001);
        employee1.setSalary(5000.0);
        employee1.setDesignation("Software Engineer");

        // Creating an Employee object using the parameterized constructor
        Employee employee2 = new Employee("Jane Smith", 1002, 6000.0, "Senior Software Engineer");

        // Displaying employee details
        employee1.displayEmployeeDetails();
        System.out.println();
        employee2.displayEmployeeDetails();

        // Calculating salaries
        System.out.println("\nSalary of Employee 1: $" + employee1.calculateSalary());
        System.out.println("Salary of Employee 2 with bonus: $" + employee2.calculateSalary(1000.0));
    }
}
/*public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 1234, 50000.0, "Software Engineer");

        System.out.println("Initial Values:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("ID: " + emp1.getId());
        System.out.println("Salary: $" + emp1.getSalary());
        System.out.println("Designation: " + emp1.getDesignation());

        emp1.setName("Jane Smith");
        emp1.setSalary(55000.0);

        System.out.println("\nUpdated Values:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: $" + emp1.getSalary());
    }



/*public class Employee {
 private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}*/
