package accessModifier.model;

import java.util.Scanner;

public class PersonHandler {
    public Person createPerson(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Person Details: ");
        String name=sc.nextLine();

        System.out.println("Please Enter the City Name :");
        String city=sc.nextLine();

        System.out.println("Please Enter the  Height:");
        String heightInCm=sc.nextLine();

        System.out.println("Please Enter the  Weight :");
        String weightInKg=sc.nextLine();

        System.out.println("Please Enter the Salary :");
        String salary=sc.nextLine();

        Person person1=new Person(Integer.valueOf(weightInKg),Integer.valueOf(heightInCm),Integer.valueOf(salary));
        person1.name=name;
        person1.city=city;

        System.out.println(Person.NATIONALITY);

        System.out.println("Personal deatils: "+person1);
        return person1;

    }
}
