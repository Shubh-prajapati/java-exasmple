package coffee.LogicDevelopment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
       List<String> words=Arrays.asList("apple","orange","apple","banana","orange","banana","apple","apple","orange","graps");

       Map<String,Long> map=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors
               .counting()));
        System.out.println(map);

        map.entrySet().stream()
                .sorted(Map.Entry.<String ,Long>comparingByValue().reversed());
        System.out.println();



    }



}
