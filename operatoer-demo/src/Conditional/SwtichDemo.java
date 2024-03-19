package Conditional;
import java.util.Scanner;
public class SwtichDemo{
    public static void main(String[] args) {
        int input =acceptNumber();
        printNumber(input);
    }
    private static  int acceptNumber(){
        System.out.println("Please Enter the Value:");
        Scanner sc=new Scanner(System.in);
        int input =Integer.valueOf(sc.nextLine());
        return input;
    }
    private static int printNumber(int No) {
        switch (No) {
            case 1: {
                System.out.println("Today is SUNDAY ENJOY THE HOLIDAY");
                break;
            }
            case 2: {
                System.out.println("Today is MONDAY BLESSING OF MAHADEV");
            }
            case 3: {
                System.out.println("Today is TUESDAY BLESSING OF HANUMANJI");
                break;
            }
            case 4: {
                System.out.println("Today is WEDNESDAY READING YOUR FAV BOOK ");
                break;
            }
            case 5: {
                System.out.println("Today is THUSDAY BLESSING OF GAJANA MAHARAJ");
                break;
            }
            case 6: {
                System.out.println("TODAY is FRIDAY PLANNING OF WEEKEND");
                break;
            }
            case 7: {
                System.out.println("TODAY IS SATURDAY ENJOY THE WEEKEND");
                break;
            }
            default: {
                System.out.println("INVALID INPUT");
                break;
            }
        }
        return No;
    }
}


