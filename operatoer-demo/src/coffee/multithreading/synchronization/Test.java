package coffee.multithreading.synchronization;

import coffee.multithreading.mythread.MyThread;

public class Test {
    public static void main(String[] args) {

       Counter counter =new Counter();
        MyT t1 =new MyT(counter);
        MyT t2 =new MyT(counter);

        t1.start();
        t2.start();

       try {
           t1.join();
           t2.join();
       }catch (Exception e){

       }
        System.out.println(counter.getCount());


    }
}
