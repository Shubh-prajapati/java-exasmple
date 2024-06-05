package coffee.oops.polymorprism.rumtime.model;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        SimpleInterest i=new SimpleInterest();

        System.out.println("Interest for one Year :" +i.calculate(8.6,1000));
        System.out.println("Interest for five Year :" +i.calculate(8.6,1000,5));


    }
}
