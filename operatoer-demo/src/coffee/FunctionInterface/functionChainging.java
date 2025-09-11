package coffee.FunctionInterface;

import java.util.function.Function;

public class functionChainging {
    public static void main(String[] args) {
        Function<Integer ,Integer> doubleIt= i-> 2*i;
        System.out.println("Double Function: "+doubleIt.apply(2));

        Function<Integer,Integer> cubeIt=i->i*i*i;
        System.out.println("Cube Function:"+cubeIt.apply(2));

        System.out.println("First Doubling :"+doubleIt.andThen(cubeIt).apply(2));

        System.out.println("Second Cubing :"+doubleIt.compose(cubeIt).apply(2));
    }




}
