interface Flyable{
    void fly_obj();
}
class Spacecraft implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Spacecraft flying outer in space\n");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Airplane is flying in the sky\n");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Helicopter is flying in the sky\n");
    }
}

public class Flyabledemo{
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}