package coffee.java_8_feature;
import java.util.Arrays;
import java.util.Comparator;

public class FindMaxLength {
    public static void main(String[] args) {
        String str=" I am learning the Stream API in Java";

      String and=Arrays.stream(str.split(" " ))
              .max(Comparator.comparing(String::length)).get();
        System.out.println(and);
    }
}
