package java.LogicDevelopment;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number of digit :");
        int num=sc.nextInt();
        int ans=0;
        for(int i=num; num!=0; num/=10)
        {
          int rem=num%10;
          ans=ans+rem;

        }
        System.out.println(ans);
    }
}

