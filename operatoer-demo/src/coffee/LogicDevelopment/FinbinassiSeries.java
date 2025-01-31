package coffee.LogicDevelopment;

import java.util.Scanner;
public class FinbinassiSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Starting Number: ");
        int Start=sc.nextInt();

        System.out.println("Enter the Ending Number: ");
        int End=sc.nextInt();
        long n1=0,n2=1, n3;

        for(int i=1; i<End; i++)
        {
            n3=n1+n2;
            
            if(n3>=Start && n3<=End)
            {
                System.out.println(n3);
            }
            n1=n2;
            n2=n3;

        }


    }

}
