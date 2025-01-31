package coffee.LogicDevelopment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Prime Number: ");
        int num= sc.nextInt();

    if(isPrime(num)){
    System.out.println(num +"is a prime Number");

    }else {
    System.out.println(num +"is a not a prime Number");
}
    }

    private static boolean isPrime(int num) {
        for(int i=2; i<num/2; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
