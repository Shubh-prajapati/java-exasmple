package coffee.multithreading.runnable;
 class MyThread implements Runnable {
    public void run(){
        try{
            //Display the thread the is running
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");

        }catch (Exception e){
            //Throwing an exception
            System.out.println("Exception is caught: "+e.getMessage());
        }
    }
}
 public class ThreadImplementationDemo{
     public static void main(String[] args)  {
         System.out.println("Demonstration of thread by extending Thread start here: ");
         int n=10; // Number of threads
         for(int i=0; i<n; i++){
         Thread thread=new Thread(new MyThread());
         thread.start();
         }
     }


 }

