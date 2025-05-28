package coffee.collection;

import java.util.ArrayList;
import java.util.List;
import  java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
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
                System.out.println("Added Buttermilk while reading ");

            }
        }
        System.out.println("Updated Shopping Lists: "+ shoppingList);

    }
}
