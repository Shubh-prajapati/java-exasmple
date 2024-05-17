package oops.classAndObject.Services;

import oops.classAndObject.model.Car;

public class CarDriver  {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.price=650000.000;
        c1.cc=1500;
        c1.brand="Mahendra";
        c1.Miliage=80;

        System.out.println("Price of the Mahendra Car: "+c1.price);
        System.out.println("CC of the Mahendra Car: "+c1.cc);
        System.out.println("Brand of the Car: "+c1.brand);
        System.out.println("Miliage of Car :"+c1.Miliage);


    }
}
