package Loops;

public class ForLoops {
 private void printNumber(int no) {
     System.out.println(no);
 }

    public static void main(String[] args) {
        ForLoops loopsClass = new ForLoops();
     for(int no=1; no<=15; ++no)
     {
         loopsClass.printNumber(no);
     }

    }
}
