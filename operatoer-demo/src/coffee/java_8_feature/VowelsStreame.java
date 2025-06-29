package coffee.java_8_feature;

import java.util.Arrays;

public class VowelsStreame{
    public static void main(String[] args) {
        String str="I am Shubham and my occupation is Java Developer";

        Arrays.stream(str.split(" "))
                .filter(x->x.replaceAll("[^aeiouAEIOU]"," ").length()==2)
                .forEach(System.out::println);



        //Arrays.stream(str.split(""))
        //.filter(x->)
    }
}
