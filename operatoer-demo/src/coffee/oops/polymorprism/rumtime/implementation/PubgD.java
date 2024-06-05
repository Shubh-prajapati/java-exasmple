package coffee.oops.polymorprism.rumtime.implementation;

import coffee.oops.polymorprism.rumtime.model.PubgUpdated;
import coffee.oops.polymorprism.rumtime.model.pubg;

public class PubgD {
    public static void main(String[] args) {
        pubg p1=new PubgUpdated(); //Upcasting
        p1.akmRecoil();
        p1.fire();
        p1.relaod();
    }

}
