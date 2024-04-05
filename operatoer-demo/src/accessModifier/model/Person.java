package accessModifier.model;

public class Person {
    public String name;
     protected String city;

     private int heightInCm;

     private int weightInKg;
     int  salary;

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


    public Person(String city, int heightInCm, int weightInKg, int salary) {
        this.city = city;
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
        this.salary = salary;
    }
}
