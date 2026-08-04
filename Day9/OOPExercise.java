package java_journey.Day9;

class Employee {
    // Private fields
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    // Returns employee details
    public String getDetails() {
        return "Name: " + getName() + ", Salary: " + getSalary();
    }
}

class Manager extends Employee {
    // Additional private field
    private String department;

    // Constructor using super()
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return this.department;
    }

    // Override getDetails()
    @Override
    public String getDetails() {
        return "Name: " + getName()
                + ", Salary: " + getSalary()
                + ", Department: " + getDepartment();
    }
}

public class OOPExercise {
    public static void main(String[] args) {

        // Polymorphism: both variables are of type Employee
        Employee emp = new Employee("Alice", 50000.0);
        Employee mgr = new Manager("Bob", 80000.0, "IT");

        // Print details
        System.out.println(emp.getDetails());
        System.out.println(mgr.getDetails());
    }
}