package java.oops.inhertance.model;

public class Navy extends Defence{
    String mode;
    String chief;
    int base;
    int soilder;

    public Navy(){}

    public Navy(String Minister, String hq, String cds, int budget, String mode, String chief, String base, int soilder){
        this.Minister=Minister;
        this.hq=hq;
        this.cds=cds;
        this.budget=budget;

        this.mode=mode;
        this.chief=chief;
        this.base= Integer.parseInt(base);
        this.soilder=soilder;

    }
    public void displayNavy(){
        displayDefence();
        System.out.println("Mode:"+mode);
        System.out.println("Chief:"+chief);
        System.out.println("Base ="+base);
        System.out.println("soldier ="+soilder);
    }
}
