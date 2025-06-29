package coffee.java_8_feature;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSecondHighest {


    //find the 2nd highest word into the given string
    public static void main(String[] args) {
        String str= "I am learning Streams in java 8";

        String ans=Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(String :: length)
                        .reversed()).skip(1).findFirst().get();

        System.out.println(ans);
    }

}
