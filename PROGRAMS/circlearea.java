
class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getarea(){
        return 3.14 *this.radius*this.radius;
    }
    public double getcircumference(){
        return 2*3.14*this.radius;
    }
    public double getradius(){
        return this.radius;
    }
}
public class circlearea{
    public static void main(String[] args) {
       java.util.Scanner scanner = new java.util.Scanner(System.in);
       System.out.println("Enter the radius of the circle");
       double radius = scanner.nextDouble();
       Circle circle = new Circle (radius);
       System.out.println("The area of the circle is "+circle.getarea());
       System.out.println("The circumference of the circle is "+circle.getcircumference());
}
}
