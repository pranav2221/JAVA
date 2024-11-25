class Rectangle{
    private double length;
    private double width;

    public Rectangle(){
        this.length=1;
        this.width=1;
    }

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getlength(){
        return this.length;
    }

    public double getwidth(){
        return this.width;
    }

    public double getarea(){
        return this.length*this.width;
    }
}
public class main{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1(default): ");
        System.out.println("Length: "+rect1.getlength());
        System.out.println("Width: "+rect1.getwidth());
        System.out.println("Area: "+rect1.getarea());

        Rectangle rect2 = new Rectangle(5,3);
        System.out.println("Rectangle 2(parametrazied):");
        System.out.println("Length:"+rect2.getlength());
        System.out.println("Width:"+rect2.getwidth());
        System.out.println("Area:"+rect2.getarea());
    }
}
