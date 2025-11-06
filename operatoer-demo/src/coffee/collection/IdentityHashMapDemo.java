package coffee.collection;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");

        Map<Integer, String> map=new HashMap<>();

//        map.put(Key1,1);
//        map.put(kay2,2);
        System.out.println(map);
    }
}
