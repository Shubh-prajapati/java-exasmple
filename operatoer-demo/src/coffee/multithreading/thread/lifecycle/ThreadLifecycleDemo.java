package coffee.multithreading.thread.lifecycle;
// Java program to demonstrate thread state & lifecyle

import coffee.multithreading.thread.ThreadImplementationDemo;

class BlueThread implements Runnable{
    public void run(){
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("State of white it called join() method on lightBlueThread -" +ThreadLifecycleDemo.whiteThread.getState());
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class ThreadLifecycleDemo  implements  Runnable{

    public static Thread whiteThread;

    public static ThreadLifecycleDemo threadLifecycleDemo;

    public  static void main(String[] args){
        threadLifecycleDemo =new ThreadLifecycleDemo();
        whiteThread =new Thread(threadLifecycleDemo);

        //whiteThread created and is currently in the New State:
        System.out.println("Start of whiteThread after creating it-"+ whiteThread.getState());
        whiteThread.getState();

        //whiteThread moved to Runnable state
        System.out.println("State of whiteThread after called start() method on it -"+ whiteThread.getState());
    }
    public void run() {
    BlueThread blueThread=new BlueThread();
    Thread lightBlueThread=new Thread(blueThread);

        // lightBlueThread created and is currently in the NEW state.
        System.out.println("State of lightBlueThread after calling it -"+lightBlueThread.getState());
        lightBlueThread.start();

        //lightBlueThrea d moved to Runnable state
        System.out.println("State of lightBlueThread after calling .state() method on it -"+ lightBlueThread.getState());

        //moving whiteThread to timed waiting state
        try{
            // moving thread to timed waiting state
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of lightBlueThread after calling sleep() method on it -"+ lightBlueThread.getState());

        try {
            //waiting for lightBlueThread to die
            lightBlueThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of lightBlueThread when it has finished it's execution - "+ lightBlueThread.getState());
    }

}
