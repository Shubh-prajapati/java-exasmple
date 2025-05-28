package coffee.multithreading.mythread;

import coffee.multithreading.synchronization.Counter;

public class MyThread extends Thread{



    //    public MyThread(String name){
//        super (name);
//
//    }
    @Override
    public void run() {
       while(true){
           System.out.println("hello world");
       }

}

    public static void main(String[] args)throws InterruptedException {

   MyThread myThread=new MyThread();
    myThread.setDaemon(true);
    myThread.start();
        System.out.println("Main Thread Dove");

    }
}
