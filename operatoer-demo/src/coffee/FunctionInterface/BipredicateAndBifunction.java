package coffee.FunctionInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;


public class BipredicateAndBifunction {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> checkSumofTwo=(a,b)->a+b >=5;
        System.out.println("sum of 2 and 5 is greater than 5 :"+ checkSumofTwo.test(2,5));
        System.out.println("sum of 2 and 1 is greater than 5: "+checkSumofTwo.test(2,1));

        BiFunction<Integer,Integer,Integer>multiplyBoth=(a,b)->a*b;
        System.out.println("Multiplication of 5 and 10 is "+multiplyBoth.apply(5,10));

    }
}
