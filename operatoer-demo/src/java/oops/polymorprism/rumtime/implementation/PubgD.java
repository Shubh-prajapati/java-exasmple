package java.oops.polymorprism.rumtime.implementation;

import java.oops.polymorprism.rumtime.model.PubgUpdated;
import java.oops.polymorprism.rumtime.model.pubg;

public class PubgD {
    public static void main(String[] args) {
        pubg p1=new PubgUpdated(); //Upcasting
        p1.akmRecoil();
        p1.fire();
        p1.relaod();
    }

}
