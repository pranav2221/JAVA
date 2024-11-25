abstract class person{
    abstract void eat();
    abstract void sleep();
    abstract void exercise();
}    
class Athlete extends person{
    @Override
    void eat(){
        System.out.println("Athletes can eat");
    }
    @Override
    void sleep(){
        System.out.println("Athletes can sleep");
    }
    @Override
    void exercise(){
        System.out.println("Athletes can exercise");
    }
}
class Lazyperson extends person{
    @Override
    void eat()
    {
        System.out.println("Lazyperson can eat");
    }
    @Override
    void sleep()
    {
        System.out.println("Lazyperson can sleep");
    }
    @Override
    void exercise()
    {
        System.out.println("Lazyperson can't exercise");
    }
}
public class abstractdemo{
    public static void main(String[] args) {
        person athlete = new Athlete();
        person lazyperson = new Lazyperson();

        System.out.println("Athlete: ");
        athlete.eat();
        athlete.sleep();
        athlete.exercise();
        System.out.println("Lazyperson: ");
        lazyperson.eat();
        lazyperson.sleep();
        lazyperson.exercise();
    }
}