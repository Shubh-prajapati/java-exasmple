package coffee.multithreading.lock;
import java.util.concurrent.locks.Lock;

public class ClassLevelLockDemo implements Runnable {
    public  void run(){
        Lock();
        }
        public void Lock(){
            System.out.println(Thread.currentThread().getName());
            synchronized (ClassLevelLockDemo.class){
                System.out.println(" in block "+ Thread.currentThread());
                System.out.println(" in block "+ Thread.currentThread());
            }
        }

        public static void main(String [] args){
        ClassLevelLockDemo classlock1=new ClassLevelLockDemo();
        Thread t1=new Thread(classlock1);
        Thread t2=new Thread(classlock1);
        ClassLevelLockDemo classLock2=new ClassLevelLockDemo();
        Thread t3=new Thread(classLock2);
        t1.setName("t1");
        t2.setName("t2");
        t2.setName("t3");
        t1.start();
        t2.start();
        t3.start();

        }
    }

