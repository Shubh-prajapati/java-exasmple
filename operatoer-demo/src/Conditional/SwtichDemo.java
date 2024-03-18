package Conditional;

import java.util.Scanner;
public class SwtichDemo{
    public static void main(String[] args) {
        int input=acceptNumber();
        printNumber(input);
    }
    private static int acceptNumber() {
        System.out.println("Please Enter the Value");
        Scanner sc = new Scanner(System.in);
        int input =Integer.valueOf(sc.nextLine());
        return input;
    }
    private static void printNumber(int no){
        switch(no) {
            case 1: {
                System.out.println("Today is SUNDAY Enjoy the Day");
                break;
            }

            case 2: {
                System.out.println("Today is MONDAY GO FOR BLESSING TO MAHADEV");
                break;
            }
            case 3: {
                System.out.println("Today is TUESDAY GO FOR COMPLETE THE TASK");
                break;
            }
            case 4: {
                System.out.println("Today is WEDNESDAY GO FOR MAKEING CHIKEN ROSTED");
                break;
            }
            case 5: {
                System.out.println("Today is THUSDAY GO FOR BLESING TO GAJANAN MAHARAJ");
                break;
            }
            case 6: {
                System.out.println("Today is FRIDAY COMPLETING THE REMAINING TASK OF THE WEEK");
                break;
            }
            case 7: {
                System.out.println("Today is SATURDAY GO FOR BLESSING FOR HANUMAN JI");
                break;
            }
            default: {
                System.out.println("You Type INVALID INPUT");
            }
        }
    }
}


