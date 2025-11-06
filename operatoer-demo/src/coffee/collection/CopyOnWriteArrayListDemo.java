package coffee.collection;

import java.util.ArrayList;
import java.util.List;
import  java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
   
        //Copy on the right array list that whenever a write operation
        // like adding and removing the elements
        //instead of that directly the modifying the existing arraysList
        // a new copy of the list is created and modification apply on the copy
        //This ensure that other threads reading the list while it being modifying are unaffected


        List<String> shoppingList =new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Break");

        System.out.println("Initial Shopping List:" +shoppingList);
        for(String item : shoppingList){
            System.out.println(item);
            // try to modify the while reading
            if(item.equals("Egg")){
                shoppingList.add("ButterMilk");
                System.out.println("Added Buttermilk while reading");
    
            }
        }
        System.out.println("Updated Shopping Lists: "+ shoppingList);

    }
}
