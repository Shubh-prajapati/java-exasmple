package coffee.java_8_feature;

import java.util.Arrays;
import java.util.List;

public class Method_Refference {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        values.forEach(System.out::println);//  System.out.println(i) call by method Refference
    }
}
