package Loops;
import java.util.Scanner;
public class ForPrimeAlpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Alphabet from wanna Start ");
        char Start=sc.next().charAt(0);

        System.out.println("Enter the Last Alphabet  ");
        char End=sc.next().charAt(0);

        for(char dum=Start;  dum<=End; dum++ )
        {
            int i;
            for(i=2; i<dum; i++)
            {
                if(dum%i ==0)
                {
                    break;
                }
            }
            if(i==dum)
            {
                System.out.println("This are the Prime Alphabet "+dum);
            }


        }
    }
}
