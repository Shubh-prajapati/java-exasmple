package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // creating the set using the HashSet Class
        Set<String> cities = new HashSet<>();

        //add() -Add elements to the set
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        System.out.println("Set :" + cities);
        System.out.println("---------------------------");

        //remove()- remove the set from the Hashset()
        System.out.println("Remove Element- \"Mumbai\" : " + cities.remove("Mumbai"));
        System.out.println("Remaing Set: " + cities);
        System.out.println("--------------------------------");

        Set<String> newCitiesSet = new HashSet<>();
        // addAll()- adds all elements
        newCitiesSet.addAll(cities);
        newCitiesSet.add("Bengaluru");
        System.out.println("New Cities Set :"+newCitiesSet);
        System.out.println("------------------------------");

        // contains()-returns true if a set contain specified element
        if(newCitiesSet.contains(2)){
            System.out.println(2+" value is present in newCitiesSet");
        }
        if(newCitiesSet.contains("Bengaluru"))
        {
            System.out.println("\"Bengaluru\" Value is present in newCitieSet");
        }
        System.out.println("---------------------------------------------------");

        // size() -retuns the length of set
        System.out.println("Size of newCitiesSet: "+newCitiesSet.size());
        System.out.println("-----------------------------------------");

        // Iterator() -returns iterator object  can be used to sequentially access elements of list
        Iterator<String> cititesIterator=newCitiesSet.iterator();
        while(cititesIterator.hasNext()){
            System.out.println("next elements in NewCitieSet : "+cititesIterator.next());
        }
        System.out.println("------------------------------------------");

        // for each loop  example
        System.out.println("using for each loop");
        for(String city: newCitiesSet){
            System.out.println("Next City: "+city);
        }
        System.out.println("----------------------");

        // Advance implementation with the reference operator.
//       String[] citiesArray=newCitiesSet.toArray(String[]::new);
//       for(String city :citiesArray){
//           System.out.println("Conversion to Array: "+city);
//       }
//        System.out.println("----------------------------------------");

        //removeAll()- remove all elements from the list
        System.out.println("Before removal - Cities List: "+cities);
        System.out.println("Before removal - New Citi List: "+newCitiesSet);
        System.out.println("Remove all elements of cities list from newCitiesList");
        System.out.println("After removal- Remaining New Cities List: "+newCitiesSet);
        System.out.println("-----------------------------------------------------");

    }

}
