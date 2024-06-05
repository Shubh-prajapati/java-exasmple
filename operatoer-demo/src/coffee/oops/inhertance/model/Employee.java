package coffee.oops.inhertance.model;

public class Employee extends Person {
    public int employeeId;

    public String dept;

    public int salary;

    @Override
    public String toString() {

       String workinglanguage="Java";
        return "Employee{" +
                "employeeId=" + employeeId +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", working language='" + workinglanguage + '\'' +
                '}';
    }
}
