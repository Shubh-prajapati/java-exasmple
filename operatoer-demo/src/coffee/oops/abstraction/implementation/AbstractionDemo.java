package coffee.oops.abstraction.implementation;

import coffee.oops.abstraction.contract.Shape;

public class AbstractionDemo {
    public static void main(String[] args) {

        //data hidings with interface
        Shape s1=new Circle();
        s1.drown();

         s1=new Rectangle();
        s1.drown();

        s1=new Square();
        s1.drown();

        System.out.println("---------------------------------");

        //data hiding using Abstract Class.
        AbstractShape a1=new Circle();
           a1.drown();

           a1=new Rectangle();
           a1.drown();

           a1=new Square();
           a1.drown();



    }
}
