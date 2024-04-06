package accessModifier.model;

public class Person {
    public String name;


     protected String city;

     private int heightInCm;

     private int weightInKg;
     int  salary;
    public static final String NATIONALITY="Indian";

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public int getHeightInCm() {
//        return heightInCm;
//    }
//
//    public void setHeightInCm(int heightInCm) {
//        this.heightInCm = heightInCm;
//    }
//
//    public int getWeightInKg() {
//        return weightInKg;
//    }
//
//    public void setWeightInKg(int weightInKg) {
//        this.weightInKg = weightInKg;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }


    public Person(int heightInCm, int weightInKg, int salary) {
        this.city = city;
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", heightInCm=" + heightInCm +
                ", weightInKg=" + weightInKg +
                ", salary=" + salary +
                ",  NATIONALITY=" +NATIONALITY +
                '}';
    }

    public Person(){

    }
}
