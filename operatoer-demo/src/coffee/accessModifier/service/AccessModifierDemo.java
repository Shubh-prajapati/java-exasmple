package coffee.accessModifier.service;
import coffee.accessModifier.model.Person;
import coffee.accessModifier.model.PersonHandler;


public class AccessModifierDemo {
    public static void main(String[] args) {
        PersonHandler ph=new PersonHandler();
        Person person =ph.createPerson();

    }
}
