package coffee.oops.polymorprism.rumtime.model;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        CompoundInterest ci=new CompoundInterest(); 
        System.out.println("Compound Interest of the Five year: "+ci.calculate(8.6,1000,5));
        System.out.println("Compound Interest of the One year: "+ci.calculate(8.6,1000));
    }
    
    
            
}
