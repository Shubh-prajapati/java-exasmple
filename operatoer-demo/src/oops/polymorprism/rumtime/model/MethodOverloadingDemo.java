package oops.polymorprism.rumtime.model;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Interest i=new Interest();

        System.out.println("Interest for one Year :" +i.calculate(8.6,1000));
        System.out.println("Interest for five Year :" +i.calculate(8.6,1000,5));


    }
}
