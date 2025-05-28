package coffee.java_8_feature;

public interface DefaultInterface  {
 default  void sayHello(){
     System.out.println("Hello");
 }
 class Parent implements DefaultInterface{

     @Override
     public void sayHello() {
         System.out.println("say child from hello");
     }
 }



}
