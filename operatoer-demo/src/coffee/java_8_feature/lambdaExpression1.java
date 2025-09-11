package coffee.java_8_feature;

import java.util.function.BiConsumer;

public class lambdaExpression1 {
    public static void main(String[] args) {
        // lambda expression is an anonymous function (without name, without return type, without access modifiers)
        // having one lambda expression (->) symbol

        BiConsumer<Integer, Integer> biConsumer=(a,b)-> System.out.println(a+b);
        biConsumer.accept(10,5);
    }
}
