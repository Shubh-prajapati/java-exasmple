package coffee.LogicDevelopment;

public class PrimeNumber {
    public static void main(String[] args) {
       int num =12;
       int i;
       if(num==1){
           System.out.println("It is Prime Number");
       }
       else {
           for(i=2; i<num; i++)
           {
               if(num%1==0)
               {
                   break;
               }
           }

           if(i==num){
               System.out.println(num+" It is a Prime Number");
           }
           else {
               System.out.println( num+" Its not a prime Number");
           }
       }

    }
}
