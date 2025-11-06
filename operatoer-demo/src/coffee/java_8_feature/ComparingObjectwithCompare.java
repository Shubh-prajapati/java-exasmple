package coffee.java_8_feature;


import java.util.*;


public class ComparingObjectwithCompare {

    public static void main(String[] args) {
        //LinkedList
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.get(2);
//        linkedList.addLast(4);
//        linkedList.addFirst(0);
//
//        System.out.println(linkedList);
//
//
//        LinkedList<String>animals=new LinkedList<>(Arrays.asList("Cat","monkey","Dog"));
//        LinkedList<String>animaltoRemove =new LinkedList<>(Arrays.asList("Dog","Lion"));
//
//        animals.removeAll(animaltoRemove);
//
//        System.out.println(animals);

        //Arrayslist and Vector

//
//        Vector<Integer> vector=new Vector<>(5,3);
//        vector.add(1);
//        vector.add(2);
//        vector.add(3);
//        vector.add(4);
//        vector.add(5);
//        System.out.println(vector.capacity());
//        vector.add(1);
//        System.out.println(vector.capacity());
//        vector.add(1);

//
      Vector<Integer> list=new Vector<>();
        Thread t1=new Thread(()->{
            for(int i=0; i<1000; i++){
                list.add(i);
            }
        });

       Thread t2=new Thread(()->{
           for(int i=0; i<1000; i++){
               list.add(i);
           }
       });

       t1.start();
       t2.start();

       try{
           t1.join();
           t2.join();

       }catch (InterruptedException e){
           e.printStackTrace();
       }

        System.out.println("Size of list: "+list.size());
    }

    }
