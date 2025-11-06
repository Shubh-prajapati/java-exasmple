package coffee.collection;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        //Hashtable is synchronized
        //No null key and value are allowed
        //Legacy class, ConcurrentHashMap
        //Only Linkedlist are allow in case of collesion

        Hashtable<Integer,String> hashTable=new Hashtable<>();
        hashTable.put(1,"Apple");
        hashTable.put(2,"Grapes");
        hashTable.put(3,"Cherry");

        System.out.println(hashTable);
        System.out.println("The Value for keywords 2: " +hashTable.get(1));
        System.out.println("Does the 3 key exits or not :"+ hashTable.containsKey(3));
        hashTable.remove(1);
        System.out.println("After the removing key 1:" +hashTable);

    }
}
