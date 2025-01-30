package coffee.LogicDevelopment;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.print("Enter Any Number: ");
        int num =sc.nextInt();
        for(int i = 1; i<=num; i++){
            fact=fact*i;

        }
        System.out.println("Factorial Number is :"+ fact);
    }
}
