package Loops;
import java.util.Scanner;
public class ForDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value for the Product ");
        int ip=sc.nextInt();
        int ans=1;
        for(int i=ip; i!=0; i/=10)
        {
            int rem=i%10;
            ans =ans * rem;

        }
        System.out.println("Thi is the Product of the Given Number :"+ans);
    }
}
