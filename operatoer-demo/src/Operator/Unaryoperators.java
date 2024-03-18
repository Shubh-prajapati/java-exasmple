package Operator;

import java.util.Scanner;

public class Unaryoperators {
        int number=0;

        void preIncrements(int input){
            System.out.println("preIncrements : "+ ++input);
            System.out.println("After preIncrements :"+ input);
        }

        void postIncrements(int input){
            System.out.println("postIncrements  "+ input++);
            System.out.println("after postIncrements "+ input);
        }
        void preDecrements(int input){
            System.out.println("preDecrements "+ --input);
            System.out.println("after preDecrements "+ input);
        }
        void postDecrements(int input){
            System.out.println("postDecrements: "+ input--);
            System.out.println("after postDecrements: "+ input);
        }
    void complements(int input){
    System.out.println("complements : "+ ~input);
        System.out.println("after complements: "+ input);
    }
    void negation(){
        System.out.println("negation: "+ !true);
    }

        public static void main(String[] args) {

            System.out.println("Please Enter the Integer Value :");
            Scanner sc=new Scanner(System.in);
            String  input=sc.nextLine();


           Unaryoperators unaryoperators=new Unaryoperators();
           int no =Integer.valueOf(input);

           unaryoperators.preIncrements(no);
           unaryoperators.postIncrements(no);

           unaryoperators.preDecrements(no);
           unaryoperators.postDecrements(no);

           unaryoperators.complements(no);
           unaryoperators.negation();


        }


}
