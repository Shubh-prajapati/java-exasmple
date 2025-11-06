package coffee.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>list=new Stack<>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);


        System.out.println(list);
        Integer removeElement = list.pop();
        System.out.println(list);

        Integer peek=list.peek();
        System.out.println(peek);

        System.out.println(list.isEmpty());
        System.out.println(list.size());

    }
}
