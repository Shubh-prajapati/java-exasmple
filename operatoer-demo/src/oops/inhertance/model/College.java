package oops.inhertance.model;

public class College extends University{
    String collegeName;
    int collegeCode;
    String Place;
    String nameOfDepartment;
    int seat;
    public College(){} // default Constructor

    College(String UniversityName, String location, String URN,String collegeName, int collegeCode, String Place, String nameOfDepartment, int seat){
        this.universityName=universityName;
        this.location=location;
        this.URN=URN;

        this.collegeCode=collegeCode;
        this.collegeName=collegeName;
        this.Place=Place;
        this.nameOfDepartment=nameOfDepartment;
    }

    public void displayCollege(){

        displayUniversity();
        System.out.println(collegeCode);
        System.out.println(collegeName);
        System.out.println(Place);
        System.out.println(seat);
        System.out.println(nameOfDepartment);

    }
}
