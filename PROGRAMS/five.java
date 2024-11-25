class cls1{
    public int add(int a,int b)
    {
        return a * b;
    }
}

class cls2 extends cls1{
    public void sumandmultiply(int a, int b){
        int sum = a + b;
        int product = a*b;
        System.out.println("Addition: "+sum);
        System.out.println("Multiply: "+product);
    }
    public void sumofsquares(int a,int b){
        int sumsquares = (a*a) + (b*b);
        System.out.println("Sum of squares: "+sumsquares);
    }
}
public class five{
    public static void main(String[] args) {
        cls2 obj = new cls2();
        int a=3;
        int b=4;

        obj.sumandmultiply(a, b);
        obj.sumofsquares(a, b);
}
}