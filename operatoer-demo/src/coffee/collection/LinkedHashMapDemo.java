package coffee.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer>linkedHashMap= new LinkedHashMap<>(11, 0.3f,true);
        linkedHashMap.put("orange",10);
        linkedHashMap.put("banana",20);
        linkedHashMap.put("graps",25);
        linkedHashMap.get("orange");
        for(Map.Entry<String, Integer> entry :linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        HashMap<String, Integer>hashMap=new HashMap<>();
        LinkedHashMap linkedHashMap1=new LinkedHashMap(hashMap);
    }
}
