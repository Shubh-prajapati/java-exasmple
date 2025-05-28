package coffee.FunctionInterface;

public class LambdaDemo {

    private final static int no =5;

    public static void main(String[] args) {
        LambdaDemo lambdaDemo=new LambdaDemo();
        lambdaDemo.userLambdaExpression();

    }


    private void userLambdaExpression(){
        //AnotherNo is method local variable
        int anotherNo =10;

        //implementation of lambda
        Square square=(no)->{

            //we can access globle variable directly inside lam
            System.out.println("Square of No: "+no * no);

            System.out.println("Square of AnotherNo "+anotherNo*anotherNo);

        };


        square.printSquare(no);
    }
}
