package coffee.java_8_feature;


import java.util.Arrays;
import java.util.List;

public class Method_Reffrence2 {
    public static void main(String[] args) {
        List<Integer>value= Arrays.asList(14,25,46,57,68,89);
        value.forEach(Method_Reffrence2 ::doubleIt);


    }

    private static void doubleIt(int i) {
        System.out.println(i*2);
    }
}
