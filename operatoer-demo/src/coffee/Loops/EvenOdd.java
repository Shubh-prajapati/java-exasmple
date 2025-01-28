package coffee.Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int i=sc.nextInt();

        do {
            if (i % 2 == 0) {
                System.out.println("This is Even Number");
                i++;

            }break;

        }while (i%2==0|| i%2!=0);
        {
            System.out.println("This is Odd Number");
        }

    }
}
