package Loops;
import sun.security.util.PendingException;

import java.util.Scanner;
public class ForCountPrimeNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Alphabet where you Start ");
        char Start=sc.next().charAt(0);

        System.out.println("Enter the Second Alphabet where you End ");
        char End=sc.next().charAt(0);

        int count=0;
        for(char dum=Start; dum<=End; dum++)
        {
            int i;
            for(i=2; i<dum; i++)
            {
                if(dum%1==0)
               break;
            }
            if(dum==i)
            {
                count++;

            }
            System.out.println("The Count of Prime Alphabet From " +Start+ "and " +End+ " is"+count);
        }

    }
}
