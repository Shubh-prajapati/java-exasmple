import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import javax.xml.transform.Templates;
import java.util.Scanner;

public class InstanceOfOperator {
    public static void main(String[] args) {

        String city="Pune";
        Integer length=23;
        Double temparature=36.5;

        if(city instanceof String)
        {
            System.out.println("Type of City is String: ");
        }
        else {
            System.out.println("Type of City is Non-String: ");
        }
        if(length instanceof Integer){
            System.out.println("length Of City is Integer");
        }
        else {
            System.out.println("lenght of City is Not Integer");
        }
        if(temparature instanceof Double){
            System.out.println("Temperature Of City is Double");
        }
        else {
            System.out.println("length of City is Not Double");
        }

    }
}
