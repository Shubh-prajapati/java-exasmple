package java.exceptionHandling;

import java.util.Scanner;

public class ExceptionWithThrowsDemo {

    public static void division() throws NumberFormatException{
        System.out.println("Please Enter 2 Value :");
        Scanner sc=new Scanner(System.in);
        String firstInput =sc.nextLine();
        String secondInput=sc.nextLine();

        int no1=Integer.valueOf(firstInput);
        int no2=Integer.valueOf(secondInput);

        System.out.println("Division: "+no1/no2);
    }


    public static void process(){
       try {
           division();
       }catch (NumberFormatException ex)
       {
           System.err.println(ex.getMessage());
       }


           }
    public static void main(String[] args) {
        process();
    }

}
