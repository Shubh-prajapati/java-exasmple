package LogicDevelopment;
public class SwapingNumber {
    public static void swapwithtemp(int no1, int no2) {

        System.out.println("Before Swapping no1 : "+no1+ " & no2 :" +no2);

        int temp=no1;
        no1=no2;
        no2=temp;

        System.out.println("After Swapping no1 : "+no1+ " & no2 :" +no2);
    }
    public static void swapwithouttemp(int no1, int no2) {

        System.out.println("Before Swapping no1 : "+no1+ " & no2 :" +no2);
        // logic without temp
        no1=no1+no2;
        no2=no1-no2;
        no1=no1-no2;

        System.out.println("After Swapping no1 : "+no1+ " & no2 :" +no2);
    }
    public static void main(String[] args) {
        int no1=10, no2=5;
        System.out.println("With temporary variable");
        swapwithtemp(no1,no2);
        System.out.println("==================");
        System.out.println("Without Temporary Variable");
        swapwithouttemp(no1,no2);

    }
}
