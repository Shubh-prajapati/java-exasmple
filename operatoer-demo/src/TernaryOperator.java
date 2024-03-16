import java.util.Scanner;
public class TernaryOperator {
    // Psuduo code
    // ....................
    // accept the No as input
    // check if No is less the 0
    //          ....print negative No
    //          else .. print Positive No

    public static void main(String[] args) {
        System.out.println("Please Enter the Value ");
        Scanner sc=new Scanner(System.in);
        int input=Integer.valueOf(sc.nextLine());

        if (input <0) {
            System.out.println("Negative Number ");
        }
        else {
            System.out.println("Positive Number ");
        }

        // ternary operator representation
        System.out.println((input<0) ? "negative Number":"positive Number");
    }
}
