
package coffee.java_8_feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStreame{
    public static void main(String[] args) {
        String[] s = {"abc", "123", "456", "xyz"};

       List<String>alp= Arrays.stream(s)
               .filter(str->str.matches("[a-zA-Z]+"))
               .collect(Collectors.toList());

        List<String>num= Arrays.stream(s)
                .filter(str->str.matches("\\d+"))
                .collect(Collectors.toList());

        System.out.print(alp);
        System.out.print(" AND ");
        System.out.print(num);
    }
}
