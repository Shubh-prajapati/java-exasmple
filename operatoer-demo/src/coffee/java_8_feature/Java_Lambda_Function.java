package coffee.java_8_feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java_Lambda_Function {
    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(15,26,37,48,59,60);
        values.forEach(i -> System.out.println(i));
    }
}
