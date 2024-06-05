package coffee.oops.inhertance.model;
public class Defence {
    String  Minister;
    String hq;
    String cds;
    int budget;

    public Defence()
    {}
    Defence(String Minister, String hq,String cds, int budget)
    {
        this.Minister=Minister;
        this.hq=hq;
        this.cds=cds;
        this.budget=budget;
    }
    public void displayDefence(){
        System.out.println(Minister);
        System.out.println(hq);
        System.out.println(cds);
        System.out.println(budget);
    }
}

