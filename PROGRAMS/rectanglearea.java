class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this .width = width;
    }

    public double calculatearea() {
         return length * width;
    }
    public double calculateperimeter(){
        return 2 * (length + width);
    }
}

public class rectanglearea{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length,width);

        System.out.println("calculate the area: "+ rectangle.calculatearea());
        System.out.println("perimeter is: "+ rectangle.calculateperimeter());
        scanner.close();
    }
}