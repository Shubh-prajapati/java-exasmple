package coffee.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String>citis=new ArrayList<>();

        // add () is used to add items in list.
        citis.add("Pune");
        citis.add("Akola");
        citis.add("Mumbai");

//       System.out.println("List of java.Array :" +citis);
//        System.out.println("----------------------------");
//        citis.add(String.valueOf(true));
//        citis.add(String.valueOf(25));
//        citis.add(String.valueOf(75986543));
//        citis.add(String.valueOf(75.6505528455955));
//        citis.add(String.valueOf('T'));

//        Check the String type data or Not
//        for (String element :citis) {
//            System.out.println(true);
//
//        }
//
//        get()- Its Helps to access elements from lists
//        String akolaCity=citis.get(1);
//        System.out.println("Accessed Element : "+akolaCity);
//        System.out.println("-------------------------------------");

        // remove() // Its helps to remove from the list
//       String removeCities= citis.remove(2);
//        System.out.println("Remove Element :" +removeCities);
//        System.out.println("Remaining Cities :"+citis);

//        // addAll()- add all elements of one list to another
        List<String> newcitiList=new ArrayList<>();
        newcitiList.addAll(citis);
       newcitiList.add("Jaipur");
        System.out.println("New List "+newcitiList);
        System.out.println("-------------------------------");


//        // contain() -return true if a list contain Specification
        if(newcitiList.contains(2))
        {
            System.out.println(2 +" value is present in newCities "+newcitiList.size());
        }

       if(newcitiList.contains("Akola"))
        {
            System.out.println("\"Akola\" value is present in newCitiesLists");
        }

        System.out.println("-----------------------------------------------------------");

//        //size() - returns the length of lists
        System.out.println("Size of New List : "+newcitiList.size());
        System.out.println("-----------------------------------------------------------");

//        // Iterator-
        Iterator<String> citiesIterator=newcitiList.iterator();
       while (citiesIterator.hasNext())
       {
           System.out.println("Next Elements in NewCitiesList "+citiesIterator.next());
       }
       System.out.println("------------------------------------------------------------");

//        //SET()- Changes elements of lists
        newcitiList.set(2,"Ahmadabad");
        while (citiesIterator.hasNext()){
            System.out.println("Next element in newCityList :"+citiesIterator.next());
        }
        System.out.println("------------------------------------------------------------");
//
//        // Using For Each java.Loops
        System.out.println("Using For Each Loop : ");
        for (String city: newcitiList)
        {
            System.out.println("Next City : "+city);
        }
        System.out.println("----------------------------------------------");
//
//        // toArray() - Convert a list into  java.Array
//        String[] citiesArray= newcitiList.toArray(new String[newcitiList.size()]);
//        for (String city : citiesArray){
//            System.out.println("Conversion to java.Array: "+city);
//        }
//        System.out.println("--------------------------------------------");
//
//        // removeAll() remove all  the elements from the list
//        System.out.println("Before Removal - Cities Lists : "+citis);
//        System.out.println("before Removal New Cities Lists : "+newcitiList);
//        System.out.println("Remove all the elements of cities list from newCitisList: "+newcitiList.removeAll(citis));
//        System.out.println("After removal - Remaining New Cities Lists "+newcitiList);
//
//        System.out.println("-----------------------------------------------");
//
//        //clear()-remove all the elements from the list [more efficient than remove-all()
//        System.out.println("Size of new CitisList before clear(): "+newcitiList.size());
//        newcitiList.clear();
//        System.out.println("Size of newCitesList after clear() "+newcitiList.size());
//
//        System.out.println("-----------------------------------------------");
    }
}
