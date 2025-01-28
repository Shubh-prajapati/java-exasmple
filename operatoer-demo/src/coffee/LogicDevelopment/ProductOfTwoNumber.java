package coffee.LogicDevelopment;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int i,r,mul,num;
        mul=1;
        r=sc.nextInt();
        num=r;

        while(num>0){
            i=num%10;
            mul=mul*i;
            num=num/10;
        }
        System.out.println("Multiply To Digit "+mul);
    }
}
