package coffee.Loops;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("========Welcome========");
        System.out.println("1. Sunday");
        System.out.println("2. Monday");
        System.out.println("3. Tuesday");
        System.out.println("4. Wednesday");
        System.out.println("5. Thursday");
        System.out.println("6. Friday");
        System.out.println("7. Saturday");

        System.out.println("Please Select Your day");
        int  input=sc.nextInt();
        switch (input)
        {
            case 1:
            {
                System.out.println("Today holiday Enjoy Our Day");
                break;
            }
            case 2:
            {
                System.out.println("Welcome to Workplace");
                break;
            }
            case 3:
            {
                System.out.println("Continue to our Office Work");
                break;

            }
            case 4:
            {
                System.out.println("Do our Work properly");
                break;
            }
            case 5:
            {
                System.out.println("Attend the meeting and do our task");
                break;
            }
            case 6:
            {
                System.out.println("Complete our Task Any How! ");
                break;
            }
            case 7:
            {
                System.out.println("Enjoy the weekend");
                break;

            }
            default:{
                System.out.println("please Enter the Input! ");
            }



        }


    }

}
