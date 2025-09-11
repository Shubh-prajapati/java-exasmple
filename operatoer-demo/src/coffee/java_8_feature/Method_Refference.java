package coffee.java_8_feature;

import java.util.Arrays;
import java.util.List;

public class Method_Refference {

    public static void main(String[] args) {


        //method refference is replace of lambda expression , It is referece method of the function interface to an exciting method
        // mainly it is used to code reusablity
        //functional interface abstract method can mapped to specific existing method using double colon operator (::)This means the method reffrence
        //hence the method reffrence is an alternative of the lambda expression

        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        values.forEach(System.out::println);//  System.out.println(i) call by method Refference
    }
}
