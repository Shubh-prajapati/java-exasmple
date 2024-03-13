import java.util.Scanner;

public class ArithmaticOperator {
 int firstNumber;
 int secondNumber;

    void addition(){
     int total= firstNumber + secondNumber;
     System.out.println("Addition of the Two Number is: "+total );
 }

    void substraction(){
        int substraction= firstNumber - secondNumber;
        System.out.println("Substraction of the Two Number is: "+substraction );
    }
    void multiplication(){
        int multiplication= firstNumber * secondNumber;
        System.out.println("Multiplication of the Two Number is: "+multiplication );
    }
    void division(){
        int division= firstNumber / secondNumber;
        System.out.println("Division of the Two Number is: "+division );
    }
    void modulus(){
        int modulus= firstNumber % secondNumber;
        System.out.println("MOD of the Two Number is: "+modulus );
    }
    public static void main(String[] args) {

        System.out.println("Please Enter the Two Value:");
        Scanner sc=new Scanner(System.in);
        String firstInput=sc.nextLine();
        String secondInput=sc.nextLine();

     ArithmaticOperator arithmaticOperator=new ArithmaticOperator();
     arithmaticOperator.firstNumber=Integer.valueOf(firstInput);
     arithmaticOperator.secondNumber=Integer.valueOf(secondInput);

     arithmaticOperator.addition();
     arithmaticOperator.substraction();
     arithmaticOperator.multiplication();
     arithmaticOperator.division();
     arithmaticOperator.modulus();
        }
}
