package coffee.collection;

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        ArrayList<Integer> list=new ArrayList<>(5);
        List<String> list=new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1=Arrays.asList("Monday", "Tuesdays");
        System.out.println(list.getClass().getName());

        String[] array={"Array", "Banana", "Cherry"};

        List<String> list2=Arrays.asList(array);
        System.out.println(list.getClass().getName());
                ;
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//


    // Using Reflection find the size of arraylist
//        Field field=ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData=(Object[]) field.get(list);
//        System.out.println("ArrayList capacity: "+elementData.length);
//
//        list.add(1);
//
//        elementData =(Object[]) field.get(list);
//        System.out.println("ArrayList capacity: "+elementData.length);


























//        System.out.println(list.get(2));
//        System.out.println(list.size()); // find the size of arrays
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(int i : list){
////            System.out.println(i);
//        }
//        System.out.println(list.contains(2)); // Retrieve the value which are exits or not, its return type is bollean
//        System.out.println(list.contains(50));


//        list.remove(2);
//        {
//            System.out.println(list);
//        }
//
//        list.add(2,56);
//        for(int i:list){
//            {
//                System.out.println(i);
//            }
//        }
//        System.out.println("-----USE-Set in ArraysList----");
//        list.set(2,50);
//        System.out.println(list); // its replace the value which are present at index 2
    }
}
