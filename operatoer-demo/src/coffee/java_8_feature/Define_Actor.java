package coffee.java_8_feature;

public interface Define_Actor {

    void act();
    void speak();

  default void comedy(){   // we can define the method from java 8 it can't possible before java 8
      System.out.println(" I can Make People Laugh ");
  }


}
