package coffee.java_8_feature;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepetedChar {
    public static void main(String[] args) {
        String str="Hello World";

        Map<Character,Long> charMap= str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        char ans=charMap.entrySet().stream().filter(m->m.getValue()>1)
                .map(x->x.getKey()).findFirst().get();

        System.out.println(ans);
    }

}
