interface Playable{
    void play();
}
class Football implements Playable{
    @Override
    public void play(){
        System.out.println("Playing football");
    }
}
class Vollyball implements Playable{
    @Override
    public void play(){
        System.out.println("Playing vollyball");
    }
}
class Basketball implements Playable{
    @Override
    public void play(){
        System.out.println("Playing basketball");
    }
} 
public class Playabledemo{
    public static void main(String[] args) {
        Playable football = new Football();
        Playable vollyball = new Vollyball();
        Playable basketball = new Basketball();
        football.play();
        vollyball.play();
        basketball.play();
    }
}