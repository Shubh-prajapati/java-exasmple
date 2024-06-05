package coffee.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //adding the 10 elements to the hashmap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Dragen");
        map.put(5, "ElderBerry");
        map.put(6, "fig");
        map.put(7, "Grape");
        map.put(8, "Honeydew");
        map.put(9, "Indian fig");
        map.put(10, "Jackfruit");

        System.out.println("Map: " + map);
        System.out.println("------------------------------------");


        //get()- helps to randomly access elements from maps
        String AppleFruits = map.get(1);
        System.out.println("Access Elements: " + AppleFruits);
        System.out.println("--------------------------------------");


        //remove() -remove an elements from the map
        String removefruits = map.remove(1);
        System.out.println("Removable Elements: " + removefruits);
        System.out.println("Remaining map: " + map);
        System.out.println("-------------------------------------------");

        // putAll() - Adding new element to existing map list
        Map<Integer, String> newFruitsmap = new HashMap<>();
        newFruitsmap.putAll(map);
        newFruitsmap.put(11, "Leechii");
        System.out.println("New Fruits List: " + newFruitsmap);
        System.out.println("---------------------------------------");

        // ContainsKey()- returns true if a map contains specified key of elements
        if (newFruitsmap.containsKey(2)) {
            System.out.println(2 + " Value is present in newFruitsMap");
            System.out.println("------------------------------------------------");
        }

        //ContainsValue() - returns true if a map contains specified the value of elements
        if (newFruitsmap.containsValue("Banana")) {
            System.out.println("\"Banana \"Value of present in newFruitMap");
            System.out.println("--------------------------------------------------");
        }

        //keyset() - Returns the set of keys
        Set<Integer> fruitsKeySet = newFruitsmap.keySet();
        Iterator<Integer> fruitsKeyIterator = fruitsKeySet.iterator();
        while (fruitsKeyIterator.hasNext())
        {
            System.out.println("Next Key in newFruitsMap: " + fruitsKeyIterator.next());
        }
            System.out.println("----------------------------------------------------------");

        //valueSet()- returns the set of value
        Iterator<String> fruitsValueIterator = newFruitsmap.values().iterator();
        while (fruitsValueIterator.hasNext()) {
            System.out.println("Next Value in newFruitsMap: " + fruitsValueIterator.next());
        }

        System.out.println("-----------------------------------------------------------");

        // Entryset() -returns iterator object that can be used to sequentially access elements of map
            Set<Map.Entry<Integer,String>> fruitsEntrySet=newFruitsmap.entrySet();
//            Iterator<Map.Entry<Integer,String>> fruitsIterator=fruitsEntrySet.iterator();
//            while(fruitsIterator.hasNext()){
//                Map.Entry<Integer,String> entry=fruitsIterator.next();


        // using For Each loops to returns the object can be used to sequentially access elements of map
        for(Map.Entry<Integer, String>entry: fruitsEntrySet) {
            System.out.println("Next element in newFruitslists: {" + entry.getKey() + ", " + entry.getValue() + "}");
        }
            System.out.println("----------------------------------------------------------------");

        //put() - changes elements of map using for each loop .
        newFruitsmap.put(2,"Apple");
        for(Map.Entry<Integer,String>entry:newFruitsmap.entrySet()){
            System.out.println("Next entry in newFruitsMap:{"+entry.getKey()+", "+entry.getValue()+", }");
        }
        System.out.println("---------------------------------------------------------------------");

        //remove()-remove all the elements from the map
        System.out.println("Before removal fruits map: "+map);
        System.out.println("Before removal New Fruits Map : "+newFruitsmap);
        System.out.println("Removal all elements of fruits map from newFruitsMap: "+newFruitsmap.remove(2));
        System.out.println("After removal -Remaining New Fruits map: "+newFruitsmap);
        System.out.println("--------------------------------------------------------");

        // clear()- remove all the elements the map (more efficient to removeAll())
//        System.out.println("Size of newFruitsMap before clear(): "+newFruitsmap.size());
//        newFruitsmap.clear();
//        System.out.println("Size of NewFruitsMap after the clear(): "+newFruitsmap.size());







        // To represent the value and key use For-Each Loop
//        for(Map.Entry<Integer,String>entry:map.entrySet()){
//            System.out.println("Key: "+entry.getKey()+", Value:  "+entry.getValue());

    }
}


