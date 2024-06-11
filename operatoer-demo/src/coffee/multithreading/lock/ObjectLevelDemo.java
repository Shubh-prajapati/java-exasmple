package coffee.multithreading.lock;

public class ObjectLevelDemo implements  Runnable{
    public void run() {
        Lock();
    }

    public void Lock(){
        System.out.println(Thread.currentThread().getName());
        synchronized (this){
            System.out.println("in block "+ Thread.currentThread());
            System.out.println("in block "+ Thread.currentThread());
    }
}

    public static void main(String[]args){
        ObjectLevelDemo objectLock1=new ObjectLevelDemo();
        Thread t1=new Thread(objectLock1);
        Thread t2=new Thread(objectLock1);
        ObjectLevelDemo objectLock2=new ObjectLevelDemo();
        Thread t3=new Thread(objectLock2);
        t1.setName("t1");
        t2.setName("t3");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }


}
