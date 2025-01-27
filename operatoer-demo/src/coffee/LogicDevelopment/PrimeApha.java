package coffee.LogicDevelopment;

import java.util.Scanner;

public class PrimeApha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet Start");
        char start =sc.next().charAt(0);

        System.out.println("Enter the Alphabet End ");
        char end =sc.next().charAt(0);

        int count=0;

        for(char i=start; i<=end; i++)
        {
            int j;
            for(j=2; j<=i; j++)
            {
                if(i% 1==0){
                    break;
                }
                if(i==j){
                    count++;
                }

            }

        }
    }
}
