package coffee.java_8_feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigiestNumber {
    public static void main(String[] args) {

        List<Integer>Num=Arrays.asList(10,20,25,35,35,85,94);

        Integer secondHighest=Num.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("The Second Highest Number is :"+secondHighest);


    }
}
