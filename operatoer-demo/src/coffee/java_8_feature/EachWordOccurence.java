package coffee.java_8_feature;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachWordOccurence {
    public static void main(String[] args) {
        String str="learning am learning learning learning stream stream in Java Java";
Map<String, Long> ans =Arrays.stream(str.split(" "))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(ans);
    }

}
