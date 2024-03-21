package Loops;
import java.util.Scanner;
public class ForLoopEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to Check It is Even Or Odd");
        int a=sc.nextInt();

        for(int i=0; i%2==0 || i%2!=0; i++){
            if(i%2==0)
            {
                System.out.println("It is an Even Number");
                break;
            }
            else {
                System.out.println("It is an Odd Number");
            }
        }
    }
}
