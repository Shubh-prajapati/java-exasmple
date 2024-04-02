package exceptionHandling;

import java.security.cert.CertificateRevokedException;
import java.util.Scanner;

public class CustomExceptionDemo {
    public static void acceptpersonDetails() throws NameNotProvidedException, CityNotProvidedException {
        System.out.println("Please Enter Name for persons: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("please enter City for Person");
        String city =sc.nextLine();

        if(name.length() == 0)
        {
            throw  new NameNotProvidedException("Provided name is Null or Invalid input: .");
        }

        if(city.length() == 0)
        {
            throw  new CityNotProvidedException("Provided name is Null or Invalid input: .");
        }
        System.out.println("Personal Detaila are: "+name+ "," +city);
    }

    public static void main(String[] args) throws NameNotProvidedException {

        while(true) {
            try {
                acceptpersonDetails();
            } catch (NameNotProvidedException | CityNotProvidedException ex) {
                System.err.println(ex.getMessage());
            }finally {
                System.out.println("Plz Enter the Data CareFully :");
            }

        }
    }
}

