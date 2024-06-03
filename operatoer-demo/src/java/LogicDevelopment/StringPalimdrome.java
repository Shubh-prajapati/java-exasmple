package java.LogicDevelopment;
import java.util.Scanner;
public class StringPalimdrome {
    public static void main(String[] args) {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to Check Palindrome or Not");
        s=sc.nextLine();
         int i,j,flag=0;

         i=0;
         j=s.length()-1;
         flag=0;

         while (i<j && flag==0)
         {
             if(s.charAt(i)!=s.charAt(j)){
                 flag=1;
                 break;
             }
             i++;
             j--;

         }
         if(flag==0)
         {
             System.out.println("Palindrome: Yes");
         }
         else{
             System.out.println("Palindrome: NO");
         }
    }
}
