package coffee.DEMO1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        String [] input={"a", "bb", "words", "dd"};


        Map<Integer, List<String>> group=new HashMap<>();

        for(String str: input){
            int len=str.length();

            group.computeIfAbsent(len, k->new ArrayList<>()).add(str);
        }
        System.out.println(group);
    }
}
