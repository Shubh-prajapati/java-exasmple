package LogicDevelopment;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Number ");
         int no=Integer.valueOf(sc.nextLine());

        // input 134-remainder=4
        //input 13-remainder=3
        //input 1-remainder=1

        // First Logic to print Reverse Number
//         while(no>0)
//         {
//            int remainder=no % 10;
//            no=no/10;
//             //System.out.println("No we Received "+no);
//             System.out.print(remainder);
//            // System.out.println("===================================");

        // Second Logic To Print Reverse Number
//         int reverseNo=0;
//         while(no>0)
//         {
//             int remainder=no%10;
//             no=no/10;
//             if(reverseNo==0)
//             {
//                 reverseNo=remainder;
//
//             }
//             else {
//                 reverseNo=(reverseNo*10)+remainder;
//             }
//             System.out.println("reverse No: "+reverseNo);
//         }
//        System.out.println("This is the Final Value of Reverse "+reverseNo);


        // Third Logic of Print Reverse Number
        int reverseNo=0;
        while(no>0)
        {
            int remainder=no%10;
            no=no/10;

            reverseNo=(reverseNo==0)?remainder:(reverseNo*10)+remainder;
            System.out.println("Reverse No:"+reverseNo);
        }
        System.out.println(reverseNo);

         }


    }


