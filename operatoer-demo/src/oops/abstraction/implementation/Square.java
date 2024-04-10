package oops.abstraction.implementation;

import oops.abstraction.contract.Shape;

public class Square extends AbstractShape {
    @Override
    public void drown() {
        // Write the own logic to drown Square
        System.out.println("Square drown");
    }
}
