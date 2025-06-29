package coffee.java_8_feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStreame{
    public static void main(String[] args) {
        String[] s = {"abc", "123", "456", "xyz"};

        List<String> alphabets = Arrays.stream(s)
                .filter(str -> str.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());

        List<String> numbers = Arrays.stream(s)
                .filter(str -> str.matches("\\d+"))
                .collect(Collectors.toList());

        System.out.print(alphabets); // [abc, xyz]
        System.out.print(" And "); // And
        System.out.print(numbers);   // [123, 456]
    }
}
