package java.Loops;

public class ForeachLoopDemo {
    private void printNo(int...nos)
    {
        for(int no:nos){
            System.out.println(no);
        }
    }
    public static void main(String[] args) {
        ForeachLoopDemo loopclass=new ForeachLoopDemo();

        loopclass.printNo(1); // print the number using the loops
        System.out.println("---------------------------------");
        loopclass.printNo(1,2,3);
        System.out.println("-----------------------------------");
        loopclass.printNo(1,2,3,4,5);
        System.out.println("------------------------------------");
        loopclass.printNo(1,2,3,4,5);
        System.out.println("--------------------------------------");
        loopclass.printNo(1,2,3,4,5,6,7);
        System.out.println("---------------------------------------");
        loopclass.printNo(1,2,3,4,5,6,7,8,9,10);
        System.out.println("-----------------------------------------");

    }
}
