package coffee.LogicDevelopment;

import java.util.Scanner;

public class EvenOddPrimeAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number to check weather it is even or odd Number");
         int ip=sc.nextInt();

        System.out.println("Enter for Number which for prime Number: ");
        int p=sc.nextInt();

        prime(p);
         evenodd(ip);

    }

    private static void prime(int p) {

      int i;
        for(i=2; i<p; i++)
        {
            if (p%i==0) {
                break;
            }
        }
        if (i==p){
            System.out.println(p+"is a Prime Number");
        }
        else {
            System.out.println(p+"is not a Prime Number");
        }
        
        
       
    }

    private static void evenodd(int ip)
    {
        if (ip%2==0)
        {
            System.out.println(ip +"Is Even Number");
        }
        else {
            System.out.println(ip +"Is Odd Number");
            
        }
    }


}
