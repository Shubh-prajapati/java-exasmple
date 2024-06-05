package coffee.oops.polymorprism.rumtime.model;

public class pubg {

   int mag=30;
   public void akmRecoil(){
       double rate=0.7;
       System.out.println("File the Rate is :"+rate);
   }

   public void fire(){
       if(mag!=0)
       {
           System.out.println("Buttet Fired");
           mag=mag-1;
       }
       else{
           System.out.println("No Bullet in raifail please Reload it");
       }
   }

    public void relaod() {
        if(mag!=30)
        {
            mag=30;
            System.out.println("Mag Reload !");
        }
        else {
            System.out.println("Mag is full !");
        }
    }
}
