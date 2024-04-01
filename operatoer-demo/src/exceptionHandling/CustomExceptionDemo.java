package exceptionHandling;

import java.security.cert.CertificateRevokedException;
import java.util.Scanner;

public class CustomExceptionDemo {
    public static void acceptpersonDetails() throws  NameNotProvidedException {
        System.out.println("Please Enter Name for persons: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("please enter City for Person");
        String city =sc.nextLine();

        if(name.length() == 0)
        {
            throw  new NameNotProvidedException("Provided name is Null or Invalid input: .");
        }
        System.out.println("Personal Detaila are: "+name+ "," +city);
    }

    public static void main(String[] args) throws NameNotProvidedException {

        try {
            acceptpersonDetails();
        }catch (NameNotProvidedException ex )
        {
            System.err.println(ex.getMessage());
        }
    }
}

