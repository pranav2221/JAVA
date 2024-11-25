class person{
    private String name;
    private int age;
    
    public person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends person{
    private String course;
    public Student(String name,int age,String course){
        super(name,age);
        this.course = course;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Course: "+course);
    }
}

class Employee extends person{
    private String JobRole;
    private double salary;
    public Employee(String name,int age,String JobRole,double salary){
        super(name,age);
        this.JobRole = JobRole;
        this.salary = salary;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("JobRole: "+JobRole);
        System.out.println("Salary: "+salary);
    }
}

public class singleInheritanceDemo{
    public static void main(String[] args) {
        Student s = new Student("Pranav",21,"AI and DS");
        System.out.println("Student Details: ");
        s.displayDetails();

        Employee e = new Employee("Pradeep",35,"Analyst",50000);
        System.out.println("Employee Details: ");
        e.displayDetails();
    }
}