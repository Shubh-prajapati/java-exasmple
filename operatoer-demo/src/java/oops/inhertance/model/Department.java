package java.oops.inhertance.model;

public class Department extends College {
    String deptName;
    int noOfStudent;
    int lectures;
    int classes;
    int lab;

    public Department(){}

    public Department(String UniversityName, String location, String URN, String collegeName, int collegeCode, String Place, String nameOfDepartment, int seat, String deptName, int noOfStudent, int lectures, int classes, int lab){
        this.deptName=deptName;
        this.noOfStudent=noOfStudent;
        this.lectures=lectures;
        this.classes=classes;
        this.lab=lab;

        this.universityName=universityName;
        this.location=location;
        this.URN=URN;

        this.collegeCode=collegeCode;
        this.collegeName=collegeName;
        this.Place=Place;
        this.nameOfDepartment=nameOfDepartment;
        this.seat=seat;
    }

    public  void displayCollege() {
        displayCollege();
        System.out.println(deptName);
        System.out.println(noOfStudent);
        System.out.println(lectures);
        System.out.println(classes);
        System.out.println(lab);
    }



}
