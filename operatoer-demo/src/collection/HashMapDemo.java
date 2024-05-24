package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

         //adding the 10 elements to the hashmap
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");
        map.put(4,"Dragen");
        map.put(5,"ElderBerry");
        map.put(6,"fig");
        map.put(7,"Grape");
        map.put(8,"Honeydew");
        map.put(9,"Indian fig");
        map.put(10,"Jackfruit");

        // To represent the value and key use For-Each Loop
        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value:  "+entry.getValue());

        }
    }
}
