package java.oops.inhertance.model;

public class University {
    String universityName;
    String location;
    String URN;

    public University() {
    }

    University(String UniversityName, String location, String URN)
    {
        this.universityName=universityName;
        this.location=location;
        this.URN=URN;
    }

    public void displayUniversity(){
        System.out.println(universityName);
        System.out.println(location);
        System.out.println(URN);
    }
}
