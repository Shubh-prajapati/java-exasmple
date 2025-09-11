package coffee.FunctionInterface;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<String> checkLength=s -> s.length()>=5;
        System.out.println("The Length of the given String is Greater the 5: "+ checkLength.test("Be Developer"));

        Predicate<String> checkEvenLength=s -> s.length() %2==0;
        System.out.println("The Length of String is:"+checkEvenLength.test("Be Developer"));

        // Its Join with and
        System.out.println("After merging with and :"+checkLength.and(checkEvenLength).test("Be Developer"));


        // Its Join with OR
        System.out.println("After merging with or :"+checkLength.or(checkEvenLength).test("Be Developer"));


        //ITs Join with negate
        System.out.println("After merging with negate :"+checkLength.negate().test("Be Developer"));

    }
}
