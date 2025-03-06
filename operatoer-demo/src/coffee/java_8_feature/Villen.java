package coffee.java_8_feature;

public class Villen implements Define_Actor {

    @Override
    public void act() {
        System.out.println("I can Act");
    }

    @Override
    public void speak() {
        System.out.println("I can Speak");
    }

    public void rude(){
        System.out.println("I m Rude");

    }
}
