package coffee.FunctionInterface;

import java.util.function.Predicate;

public class PredicateFunctionalDemo {
    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() >= 5;

        System.out.println("The length of String is greater than 5 : " + checkLength.test("Developer"));
    }
}
