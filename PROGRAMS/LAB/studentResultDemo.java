class student{
     int rn;
     public void getno(int rn){
        this.rn = rn;
     }
     public void putno(){
        System.out.println("Roll number: "+rn);
     }
}
class Test extends student{
    int part1,part2;
    public void getmarks(int part1,int part2){
        this.part1=part1;
        this.part2=part2;
    }
    public void putmarks(){
        System.out.println("marks in part1: "+part1);
        System.out.println("marks in part2: "+part2);
    }
}
interface sport{
    int sportwt = 10;

    void putt();
}
class Result extends Test implements sport{
    int total;
    public void calculatetotal(){
        total = part1+part2+sportwt;
    }
    @Override
    public void putt(){
        System.out.println("Sport weightage: "+sportwt);
    }
    public void displayResult(){
        putno();
        putmarks();
        putt();
        System.out.println("Total score: "+total);
    }
}
public class studentResultDemo{
    public static void main(String[]args){
        Result r = new Result();
        r.getno(101);
        r.getmarks(50,40);
        r.calculatetotal();
        System.out.println("Student Result");
        r.displayResult();
    }
}