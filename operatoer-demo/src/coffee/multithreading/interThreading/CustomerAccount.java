package coffee.multithreading.interThreading;

public class CustomerAccount {
    int amount =10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw.....");

        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposite....");
            try {
                wait();
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        this.amount -=amount;
        System.out.println("withdraw completed...");
    }
    synchronized void deposite(int amount){
        System.out.println("Going to deposit....");
        this.amount+=amount;
        System.out.println("deposit compleated....");
        notify();
    }
}
