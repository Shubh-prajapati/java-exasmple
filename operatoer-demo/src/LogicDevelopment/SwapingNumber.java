package LogicDevelopment;
import oops.polymorprism.rumtime.model.Interest;

import java.util.Scanner;

public class SwapingNumber {
    public static void swapwithtemp(int no1, int no2) {

        System.out.println("Before Swapping no1 : "+no1+ " & no2 :" +no2);

        int temp=no1;
        no1=no2;
        no2=temp;

        System.out.println("After Swapping no1 : "+no1+ " & no2 :" +no2);
    }
    public static void swapwithouttemp(int no1, int no2) {

        System.out.println("Before Swapping no1 : "+no1+ " & no2 :" +no2);
        // logic without temp
        no1=no1+no2;
        no2=no1-no2;
        no1=no1-no2;

        System.out.println("After Swapping no1 : "+no1+ " & no2 :" +no2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number for the swapping :");
        int no1= Integer.parseInt(sc.nextLine());


        System.out.println("Enter the Second Number for the swapping ");
        int no2=Integer.parseInt(sc.nextLine());

        System.out.println("With temporary variable");
        swapwithtemp(no1,no2);
        System.out.println("==================");
        System.out.println("Without Temporary Variable");
        swapwithouttemp(no1,no2);

    }
}
