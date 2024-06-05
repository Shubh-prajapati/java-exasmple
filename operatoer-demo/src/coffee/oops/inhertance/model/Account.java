package coffee.oops.inhertance.model;

public class Account {
    String bank;
    String name;
    String accNo;
    int ifsc;
    String branch;

    public Account(){}

    Account(String bank, String name, String accNo, int ifsc, String branch){
        this.bank=bank;
        this.name=name;
        this.accNo=accNo;
        this.ifsc=ifsc;
        this.branch=branch;
    }

   public void displayAccount(){
       System.out.println(name);
       System.out.println(bank);
       System.out.println(accNo);
       System.out.println(ifsc);
       System.out.println(branch);
   }
}
