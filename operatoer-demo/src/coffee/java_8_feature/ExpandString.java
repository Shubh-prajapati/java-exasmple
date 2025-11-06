package coffee.java_8_feature;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpandString {

        public static void main(String[] args) {
            String input = "a3b2c2d4";

            String output = IntStream.range(0, input.length())
                    .filter(i -> Character.isLetter(input.charAt(i)))
                    .mapToObj(i -> {
                        char ch = input.charAt(i);
                        int count = Character.getNumericValue(input.charAt(i + 1));

                        return IntStream.range(0, count)
                                .mapToObj(j -> String.valueOf(ch))
                                .collect(Collectors.joining());
                    })
                    .collect(Collectors.joining());

            System.out.println(output); // aaabbccdddd
        }
    }

