package java.oops.inhertance.model;

public class SavingAccount extends Account{
    double amount;
    double minBalance;
    double limit;
    int roi;

 public SavingAccount(){} // Defualt Constructor

    public SavingAccount(String bank, String name, String accNo, int ifsc, String branch, double amount, double minBalance, double limit, int roi){
        this.bank=bank;
        this.name=name;
        this.accNo=accNo;
        this.ifsc=ifsc;
        this.branch=branch;

        this.amount=amount;
        this.minBalance=minBalance;
        this.limit=limit;
        this.roi=roi;
    }
     public void displaySavingAccount(){
        displayAccount();

         System.out.println(amount);
         System.out.println(limit);
         System.out.println(minBalance);
         System.out.println(roi);

     }



}
