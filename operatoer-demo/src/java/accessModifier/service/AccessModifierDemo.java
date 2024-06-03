package java.accessModifier.service;
import java.accessModifier.model.Person;
import java.accessModifier.model.PersonHandler;


public class AccessModifierDemo {
    public static void main(String[] args) {
        PersonHandler ph=new PersonHandler();
        Person person =ph.createPerson();

    }
}
