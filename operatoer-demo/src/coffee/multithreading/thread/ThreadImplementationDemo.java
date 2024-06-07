package coffee.multithreading.thread;

 class My_Thread extends Thread {
 public void run(){
     try {
         // Display the thread that is running
         System.out.println("Thread "+Thread.currentThread().getId()+" is  running");
     }catch (Exception e){
      //Throwing an exception
      System.out.println("Exception is cought:" +e.getMessage());
     }
 }

}
// main class.
public class ThreadImplementationDemo{
 public static void main(String[] args) {
  System.out.println("Demonstration of thread by extending Thread start here: ");
  int n = 10; // Number of threads
  for (int i = 0; i < n; i++)
  {
   My_Thread thread=new My_Thread();
   thread.start();
  }
 }
}
