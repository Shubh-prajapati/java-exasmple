package coffee.multithreading.synchronization;

public class MyT extends Thread{
    private  Counter counter;

    public MyT(Counter counter){
        this.counter=counter;

    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}
