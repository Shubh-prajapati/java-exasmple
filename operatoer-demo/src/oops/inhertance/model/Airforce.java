package oops.inhertance.model;

public class Airforce extends Defence{
    String mode;
    String chief;
    String base;
    int soldier;

    public Airforce(){}

    public Airforce(String Minister, String hq, String cds, int budget, String mode, String chief, String base, int soldier)
    {
        this.Minister=Minister;
        this.hq=hq;
        this.cds=cds;
        this.budget=budget;

        this.mode=mode;
        this.chief=chief;
        this.base=base;
        this.soldier=soldier;

    }
     public void displayAirforce(){
         System.out.println(mode);
         System.out.println(chief);
         System.out.println(base);
         System.out.println(soldier);

    }

}
