package oops.polymorprism.rumtime.model;

public class CompoundInterest extends SimpleInterest {
     public double calculate (double interstRate,int principalerate, int year)
     {
          return principalerate + Math.pow(1.0 +interstRate/100.0,year)- principalerate;
     }

     public double calculate (double interstRate,int principalerate){
          return principalerate + Math.pow(1.0 + interstRate/100.0,1)-principalerate;
     }
}
