package coffee.LogicDevelopment;



import java.util.Scanner;

public class DisplayTable {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int input=sc.nextInt();

        System.out.println("Enter which highest wanna multiply");
        int n=sc.nextInt();

        System.out.println("Your Table of :"+input);
        int i=1,res;
        while(i<=n){
            res=input*i;
            System.out.println(res);
            i++;
        }


    }

}
