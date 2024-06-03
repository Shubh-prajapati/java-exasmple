package java.exceptionHandling;

import java.util.Scanner;
public class ExceptionWithTryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Please Enter the Two Value: ");
        Scanner sc=new Scanner(System.in);
        String firstNumber=sc.nextLine();
        String secondNumber=sc.nextLine();

        try {
            int no1 = Integer.valueOf(firstNumber);
            int no2 = Integer.valueOf(secondNumber);

            System.out.println("Division: " + (no1 / no2));
        }
        catch (NumberFormatException exception)
        {
            System.err.println("Enter the Number aew Not valid Number :");
        }
    }

}
