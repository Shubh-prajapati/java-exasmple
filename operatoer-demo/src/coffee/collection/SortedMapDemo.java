package coffee.collection;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;


public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String>map=new TreeMap<>((a,b)->b-a);
         map.put(91, "Raj");
         map.put(92, "Mukesh");
         map.put(93, "Suresh");
         map.put(77, "Saurabh");
//        System.out.println(map);

//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap(92)); // exclude  inserted digit
//        System.out.println(map.tailMap(91));


        NavigableMap<Integer,String>navigableMap=new TreeMap<>();
        navigableMap.put(1,"One");
        navigableMap.put(2, "Three");
        navigableMap.put(5,"Five");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(5));
        System.out.println(navigableMap.ceilingKey(2)); // if the value is match its show the same key
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());


    }
}
