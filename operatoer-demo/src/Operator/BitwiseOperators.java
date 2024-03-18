package Operator;

import java.util.Scanner;

public class BitwiseOperators {
     static int firstNumber = 0;
     static int secondNumber = 0;

//  public static void bitwiseOperation(){
//        int result= firstNumber & secondNumber;
//        System.out.println("Bitwise And Result : "+result );
//    }
//
//
//    public static void main(String[] args) {
//
//        System.out.println("Please Enter the Two Value:");
//        Scanner sc = new Scanner(System.in);
//        firstNumber = Integer.valueOf(sc.nextLine());
//        secondNumber = Integer.valueOf(sc.nextLine());
//
//
//        bitwiseOperation();

    // Bitwise OR Operaotor
        public static void bitwiseOperation(){
            int result= firstNumber | secondNumber;
            System.out.println("Bitwise OR Result : "+result );
        }


        public static void main(String[] args) {

            System.out.println("Please Enter the Two Value:");
            Scanner sc = new Scanner(System.in);
            firstNumber = Integer.valueOf(sc.nextLine());
            secondNumber = Integer.valueOf(sc.nextLine());


            bitwiseOperation();
    }
}
