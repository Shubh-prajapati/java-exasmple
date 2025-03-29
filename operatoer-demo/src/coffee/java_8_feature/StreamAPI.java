package coffee.java_8_feature;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5);

//        int result=0;
//        for(int i: values)
//        {
//                result=result+i;
//        }
//        System.out.println(result);
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)-> c+e));


    }


}
