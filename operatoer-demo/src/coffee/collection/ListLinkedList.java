package coffee.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class ListLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.addFirst(0);
        linkedList.addLast(5);
        linkedList.add(2,15);
        linkedList.getLast();
        linkedList.removeIf(x ->x%2==0);
        System.out.println(linkedList);


//
//        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Cat", "Dog", "Element"));
//        LinkedList<String> animalToRemove=new LinkedList<>(Arrays.asList("Dog", "lion"));
//        animals.removeAll(animalToRemove);
//        System.out.println(animals);

    }

}
