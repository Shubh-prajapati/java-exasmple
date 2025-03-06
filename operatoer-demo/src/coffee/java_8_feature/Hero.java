package coffee.java_8_feature;

public class Hero implements Define_Actor {

    public  void act()
    {
        System.out.println(" I can Act for Efficiently");
    }

    public void speak(){
        System.out.println("I can Speak ");
    }


    @Override
    public void comedy() {
        System.out.println(" I can People Laugh");
    }
}
