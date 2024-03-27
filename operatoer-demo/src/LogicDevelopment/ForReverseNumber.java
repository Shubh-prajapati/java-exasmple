package LogicDevelopment;
import java.util.Scanner;
public class ForReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for Reverse :");
        int no=Integer.valueOf(sc.nextLine());

        int reverseNumber=0;
        for(int anotherNo=no; anotherNo>0; anotherNo=anotherNo/10)
        {
            int remainder=anotherNo%10;

            reverseNumber=(reverseNumber==0)? remainder: (reverseNumber*10)+remainder;
        }
        System.out.println(reverseNumber);
    }

}
