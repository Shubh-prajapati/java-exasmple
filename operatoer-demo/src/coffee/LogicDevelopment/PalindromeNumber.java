package coffee.LogicDevelopment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Palindrome ");
        int no=sc.nextInt();

        if(isPalindrome(no)){
            System.out.println(no+" is a palindrome");

        }else {
            System.out.println(no+ "is not a palindrome ");
        }
    }

    private static boolean isPalindrome(int no) {
        int originalNo=no;
        int reverseNo=0;

        while(no !=0){
            int digit=no%10;
            reverseNo=reverseNo * 10+digit;
            no=no/10;
        }
        return  originalNo == reverseNo;
    }
}
