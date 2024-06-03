package java.LogicDevelopment;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the positive integer Number n:");
        int n=sc.nextInt();

        // Check if the input is Valid
        if(n<=0){
            System.out.println("n Cannot be Zero or Negative ");
            return;
        }
        double harmonicNumber =0.0;

        // calculate the Nth Harmonic
         for(int i=1; i<=n; i++)
         {
             harmonicNumber +=1.0/i;

         }
         //output the result
        System.out.printf("The %dth harmonic number is: %.5f%n", n,harmonicNumber);




        }
}
