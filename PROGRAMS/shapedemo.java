class shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public double calculatearea(){
        return 0.0;
    }
}
class Circle extends shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
    @Override
    public double calculatearea(){
        return 3.14 * radius * radius;
    }
}
class Cylinder extends shape{
    private double radius;
    private double height;
    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a cylinder");
    }
    @Override
    public double calculatearea(){
        double baseArea = Math.PI * radius * radius;
        double lateralSurfaceArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralSurfaceArea;
    }
}
    public class shapedemo{
        public static void main(String[] args) {
            Circle circle = new Circle(5);
            circle.draw();
            System.out.println("Area of Circle: " + circle.calculatearea());

            Cylinder cylinder = new Cylinder(5.0,10.0);
            cylinder.draw();
            System.out.println("Area of cylinder is " + cylinder.calculatearea());
    }
}