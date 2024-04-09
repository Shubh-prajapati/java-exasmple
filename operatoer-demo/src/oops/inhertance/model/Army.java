package oops.inhertance.model;

public class Army extends Defence{
    String mode;
    String chief;
    int base;
    int solider;
    public Army(){}

    public Army(String Minister, String hq, String cds, int budget, String mode, String chief, String base, int soldier){
        this.Minister=Minister;
        this.hq=hq;
        this.cds=cds;
        this.budget=budget;

        this.mode=mode;
        this.chief=chief;
        this.base= Integer.parseInt(base);
        this.solider=soldier;
    }
     public void displayArmy(){
         System.out.println("Mode: "+mode);
         System.out.println("Chief: "+chief);
         System.out.println("Base: "+base);
         System.out.println("Solider: "+solider);
     }
}
