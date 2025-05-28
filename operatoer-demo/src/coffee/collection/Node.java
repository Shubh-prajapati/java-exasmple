package coffee.collection;

import coffee.oops.abstraction.implementation.Circle;

import java.util.LinkedList;
import java.util.List;

public class Node {
    public static void main(String[] args) {
        LinkedList<String> citys = new LinkedList<>();


        citys.add("Akola");
        citys.add("Amravati");
        citys.add("Pune");
        citys.add("Murtizapur");
        citys.add("Nanded");
        citys.get(1);
        citys.addFirst("Mumbai");
        citys.addLast("Alibagh");

        System.out.println("Show the  city"+citys);
        citys.remove(2);
        System.out.println("Show the  city"+citys);
    }


}
