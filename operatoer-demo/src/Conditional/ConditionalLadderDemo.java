package Conditional;

import java.util.Scanner;

public class ConditionalLadderDemo {
    public static void main(String[] args) {
         int input =acceptNumber ();
        printNumber(input);
    }
        private static  int acceptNumber(){
            System.out.println("Please Enter the Value: ");
            Scanner sc=new Scanner(System.in);
            int input =Integer.valueOf(sc.nextLine());
            return input;
        }
        private static void printNumber(int no){
        if  (no<=10){
            if(no==0) {
                System.out.println("zero");
            }
            if(no==1) {
                System.out.println("one");
            }
            if(no==2) {
                System.out.println("two");
            }
            if(no==3) {
                System.out.println("three");
            }
            if(no==4) {
                System.out.println("four");
            }
            if(no==5) {
                System.out.println("five");
            }
            if(no==6) {
                System.out.println("six");
            }
            if(no==7) {
                System.out.println("seven");
            }
            if(no==8) {
                System.out.println("eight");
            }
            if(no==9) {
                System.out.println("nine");
            }
            if(no==10) {
                System.out.println("ten ");
            }
            else if(no<=10){
                System.out.println("this Number is in between 1 to 20");
            }
            else if(no<=20)
            {
                System.out.println("this no is in between 1 to 20");
            }else if(no<=30){
                System.out.println("this no is in between 21 to 30");
            }else {
                System.out.println("Doesn't match the Value ");
            }


            }
        }



}
