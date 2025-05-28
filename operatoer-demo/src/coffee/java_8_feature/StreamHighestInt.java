package coffee.java_8_feature;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;

public class StreamHighestInt {
    // second highest the find character into integer

    public static void main(String[] args) {
        String str="I am Learning Streams in Java ";
       int ans =Arrays.stream(str.split(" "))
                .map(x-> x.length()).sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        System.out.println(ans);

    }
}
