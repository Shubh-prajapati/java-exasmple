package Loops;

public class DoWhileLoop {
    private  void printNumber(int no){
        System.out.println(no);
    }
    public static void main(String[] args) {
        DoWhileLoop  loops= new DoWhileLoop();
        int no=1;
        do{
            loops.printNumber(++no);

        }while(no<=10);
    }
}
