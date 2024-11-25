import java.util.Scanner;

class Faculty {
    protected String name;
    protected String designation;
    protected double basicSalary;

    public Faculty(String name, String designation, double basicSalary) {
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    public double calculateAnnualSalary() {
        return basicSalary * 12; 
    }

    public void displayDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

class FullTimeFaculty extends Faculty {
    private double allowance; 
    public FullTimeFaculty(String name, String designation, double basicSalary, double allowance) {
        super(name, designation, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateAnnualSalary() {
        return (basicSalary + allowance) * 12; 
    }
}

class PartTimeFaculty extends Faculty {
    private double hourlyRate;
    private int hoursPerMonth;

    public PartTimeFaculty(String name, String designation, double basicSalary, double hourlyRate, int hoursPerMonth) {
        super(name, designation, basicSalary);
        this.hourlyRate = hourlyRate;
        this.hoursPerMonth = hoursPerMonth;
    }

    @Override
    public double calculateAnnualSalary() {
        double monthlySalary = basicSalary + (hourlyRate * hoursPerMonth);
        return monthlySalary * 12; 
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Full-Time Faculty:");
        System.out.print("Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Designation: ");
        String fullDesignation = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double fullBasicSalary = scanner.nextDouble();
        System.out.print("Allowance: ");
        double fullAllowance = scanner.nextDouble();

        FullTimeFaculty fullTimeFaculty = new FullTimeFaculty(fullName, fullDesignation, fullBasicSalary, fullAllowance);
        System.out.println("\nFull-Time Faculty Details:");
        fullTimeFaculty.displayDetails();
        System.out.println();
        scanner.nextLine();
        System.out.println("Enter details for Part-Time Faculty:");
        System.out.print("Name: ");
        String partName = scanner.nextLine();
        System.out.print("Designation: ");
        String partDesignation = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double partBasicSalary = scanner.nextDouble();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours Per Month: ");
        int hoursPerMonth = scanner.nextInt();
        PartTimeFaculty partTimeFaculty = new PartTimeFaculty(partName, partDesignation, partBasicSalary, hourlyRate, hoursPerMonth);
        System.out.println("\nPart-Time Faculty Details:");
        partTimeFaculty.displayDetails();
        scanner.close();
    }
}
