package accessModifier.service;
import accessModifier.model.Person;
import accessModifier.model.PersonHandler;


public class AccessModifierDemo {
    public static void main(String[] args) {
        PersonHandler ph=new PersonHandler();
        Person person =ph.createPerson();

    }
}
