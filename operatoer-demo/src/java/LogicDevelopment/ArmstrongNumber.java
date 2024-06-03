package java.LogicDevelopment;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n,arm=0, rem,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any Number ");
        n=sc.nextInt();
        c=n;

        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm) {
            System.out.println("ArmStrong NUmber");
        }
        else{
            System.out.println("Not ArmStrong Number");
        }
    }


}
