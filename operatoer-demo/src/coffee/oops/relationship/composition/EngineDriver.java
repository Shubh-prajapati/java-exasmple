package coffee.oops.relationship.composition;

public class EngineDriver {
    public static void main(String[] args) {
        Engine e1=new Engine("Petrol",1500,8,"Automation",1232,84,4);
        e1.displayEngine();
        System.out.println("-------------------------------------------------------");
        Engine e2=new Engine("Deseal",1600,8,"Driveless",6,1256,2);
        e2.displayEngine();
        System.out.println("--------------------------------------------------------");
        Engine e3=new Engine("Hydrogen",1800,5,"Automatic",85,65,4);
        e3.displayEngine();
        System.out.println("----------------------------------------------------------");

    }
}
