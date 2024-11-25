import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
class Person {
    protected String name;
    protected String birthdate; 
    protected double height; 
    protected double weight; 
    protected String address;
    public Person(String name, String birthdate, double height, double weight, String address) {
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }
    public int calculateAge() {
        LocalDate birthDate = LocalDate.parse(birthdate);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Address: " + address);
        System.out.println("Age: " + calculateAge() + " years");
    }
}
class Student extends Person {
    private String rollNo;
    private double[] marks;
    public Student(String name, String birthdate, double height, double weight, String address, String rollNo, double[] marks) {
        super(name, birthdate, height, weight, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public double calculateAvg() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }
    public void displayPersonDetails() {
        super.displayPersonDetails(); 
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average Marks: " + calculateAvg());
    }
}
class Employee extends Person {
    private String empId;
    private double salary;
    public Employee(String name, String birthdate, double height, double weight, String address, String empId, double salary) {
        super(name, birthdate, height, weight, address);
        this.empId = empId;
        this.salary = salary;
    }
    public double calculateTax() {
        return salary * 0.10; 
    }
    public void displayPersonDetails() {
        super.displayPersonDetails(); 
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: Rs " + salary);
        System.out.println("Tax: Rs " + calculateTax());
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Student:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Birthdate (YYYY-MM-DD): ");
        String studentBirthdate = scanner.nextLine();
        System.out.print("Height (m): ");
        double studentHeight = scanner.nextDouble();
        System.out.print("Weight (kg): ");
        double studentWeight = scanner.nextDouble();
        System.out.print("Address: ");
        scanner.nextLine(); // Clear buffer
        String studentAddress = scanner.nextLine();
        System.out.print("Roll No: ");
        String rollNo = scanner.nextLine();
        System.out.print("Enter number of marks: ");
        int numMarks = scanner.nextInt();
        double[] marks = new double[numMarks];
        for (int i = 0; i < numMarks; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        Student student = new Student(studentName, studentBirthdate, studentHeight, studentWeight, studentAddress, rollNo, marks);
        System.out.println("\nEnter details for Employee:");
        System.out.print("Name: ");
        scanner.nextLine(); // Clear buffer
        String employeeName = scanner.nextLine();
        System.out.print("Birthdate (YYYY-MM-DD): ");
        String employeeBirthdate = scanner.nextLine();
        System.out.print("Height (m): ");
        double employeeHeight = scanner.nextDouble();
        System.out.print("Weight (kg): ");
        double employeeWeight = scanner.nextDouble();
        System.out.print("Address: ");
        scanner.nextLine(); // Clear buffer
        String employeeAddress = scanner.nextLine();
        System.out.print("Employee ID: ");
        String empId = scanner.nextLine();
        System.out.print("Salary: Rs ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(employeeName, employeeBirthdate, employeeHeight, employeeWeight, employeeAddress, empId, salary);
        System.out.println("\nStudent Details:");
        student.displayPersonDetails();
        System.out.println("\nEmployee Details:");
        employee.displayPersonDetails();
        scanner.close();
    }
}

