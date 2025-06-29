package coffee.java_8_feature;


import java.util.Arrays;
import java.util.List;

public class Method_Reffrence2 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(14, 25, 36, 47, 59, 60);
        values.forEach(Method_Reffrence2:: doubleIt);
    }
    public static void doubleIt(int i){
        System.out.println(i*2);
    }
}
