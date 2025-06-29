package coffee.SecnarioBase.Basic;

import java.util.Scanner;

public class ArithmeticSecnario {
    //Handle the secnario where the user enter zero to avoid arithmethic experssion

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();


        try {
            if(n==0){
                throw new ArithmeticException("Cannot find the resiprocal of 0");
            }
            double res= 1.0/n;
            System.out.println(res);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
