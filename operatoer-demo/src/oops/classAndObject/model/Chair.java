package oops.classAndObject.model;

import javax.swing.plaf.IconUIResource;

public class Chair {
    public String color;
    public String brand;
    public String material;
    public  double price;

    Chair(){
        // default Constructor;
    }
    public Chair(String color, String material, double price, String brand)
    {
        this.color=color;
        this.material=material;
        this.price=price;
        this.brand=brand;
    }

    public void displayChair() {
        System.out.println("This is color of Chair :"+color);
        System.out.println("This is Material of Chair :"+material);
        System.out.println("This is Price of the Chair :"+price);
        System.out.println("This is Brand of the Chair :"+brand);
    }
}
