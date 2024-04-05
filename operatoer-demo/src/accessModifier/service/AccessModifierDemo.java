package accessModifier.service;
import accessModifier.model.Person;

import java.sql.SQLOutput;
import java.util.Scanner;
public class AccessModifierDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Person Details: ");
        String name=sc.nextLine();

        System.out.println("Please Enter the City Name :");
        String city=sc.nextLine();

        System.out.println("Please Enter the  Height:");
        String heightInCm=sc.nextLine();


        System.out.println("Please Enter the  Weight :");
        String  weightInKg=sc.nextLine();

        System.out.println("Please Enter the Salary :");
        String salary=sc.nextLine();

        Person person1=new Person(city,Integer.valueOf(weightInKg),Integer.valueOf(heightInCm),Integer.valueOf(salary));
        person1.name=name;

        System.out.println("Personal deatils: "+person1);

    }
}
