import java.util.Scanner;

public class LogicalOperators {
    // Logical And Operator
//    public static void main(String[] args) {
//        System.out.println("Please Enter the Value :");
//        Scanner sc=new Scanner(System.in);
//        String input=sc.nextLine();
//
//        if(Integer.valueOf(input)>0 && Integer.valueOf(input)<1000) {
//            System.out.println("Condition Matching All Good");
//        }
//        else {
//            System.out.println("Condition Not Matching All Good");
//        }
//    }

    // Logical OR Operator

    public static void main(String[] args) {
        System.out.println("Please Enter the Value :");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        if(Integer.valueOf(input) % 17==0 || Integer.valueOf(input) % 2==0) {
            System.out.println("Condition Matching - Found the Matching Value ");
        }
        else {
            System.out.println("Condition Not Matching - All Not Good");
        }
    }
}

