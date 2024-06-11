package coffee.lambda;

import coffee.oops.abstraction.implementation.Square;

public class LamdaDemo {
    // class instance variable
    private final static int no=5;

    public static void main(String[] args) {
        LamdaDemo lamdaDemo=new LamdaDemo();
        lamdaDemo.useLamdaExpression();
    }

    private void useLamdaExpression() {
        int anotherNo=10;


        // implementation of lambda
        Square square=(no)-> {
            // we can access global variable directly inside lambda implementation
            System.out.println("Square of no: "+no * no);
            // we can access local varibles directly inside lambda implementation
            System.out.println("Square of another: "+anotherNo * anotherNo);

            // local variable we use inside lambda are always final implementation or effiectily   final
            //anotherNo=100;
        };

        //actual usage of lambda
        square.printSquare(no);
    }
}
