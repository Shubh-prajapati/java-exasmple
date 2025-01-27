package coffee.LogicDevelopment;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=15;
        int i;
        if(num==1){
            System.out.println("Its a Prime Number");

        }
        else {
            for (i=2; i<num; i++)
            {
                if(num %i==0)
                {
                    break;
                }

            }
            if(i==num)
            {
                System.out.println( num+ " It is a Prime Number ");
            }
            else{
                System.out.println( num +" Its not a Prime Number");
            }

        }
    }

}
