package java.oops.inhertance.service;

import java.oops.inhertance.model.Programmer;

import java.util.Scanner;

public class inheritanceDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of Employee");
        String name=sc.nextLine();

        System.out.println("Please Enter the City of Employee :");
        String city=sc.nextLine();

        System.out.println("Please Enter the Id of Employee:");
        String employeeId=sc.nextLine();

        System.out.println("Please Enter the dept of Employee :");
        String dept=sc.nextLine();

        System.out.println("Please Enter the Salary of Employee :");
        String salary= sc.nextLine();

        System.out.println("Please Enter the WorkingLanguage of Employee :");
        String workingLanguage=sc.nextLine();

       Programmer programmer=new Programmer();

        programmer.name=name;
        programmer.city=city;
        programmer.dept=dept;
        programmer.employeeId= Integer.parseInt(employeeId);
        programmer.salary= Integer.parseInt(salary);
        programmer.workingLanguage=workingLanguage;


        System.out.println(programmer);


    }
}
