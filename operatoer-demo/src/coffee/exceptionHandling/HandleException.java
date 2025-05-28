package coffee.exceptionHandling;

import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in );

        System.out.println("Enter the Any Number");
        int num= sc.nextInt();

        try {
            System.out.println(100/num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid Input ");
        }
        System.out.println("Program Completed.......");
        System.out.println("Program Executed.........");
    }
}
