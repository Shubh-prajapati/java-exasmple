package coffee.java_8_feature;


import java.util.Arrays;
import java.util.List;

public class Method_Reffrence2 {
    public static void main(String[] args) {
       List<Integer> values = Arrays.asList(1,2,3,4,5,6);
       values.forEach(Method_Reffrence2 :: doubleit); // call by reference 
    }
    public static void doubleit(int i){
        System.out.println(i*2);
    }
}
