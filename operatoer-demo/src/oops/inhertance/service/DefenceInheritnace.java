package oops.inhertance.service;

import oops.inhertance.model.Airforce;
import oops.inhertance.model.Army;
import oops.inhertance.model.Navy;

public class DefenceInheritnace {
    public static void main(String[] args) {
        Airforce a1 = new Airforce("Shubh", "Delhi", "Narware", 70000, "Air", "VR Chaudhri", "60", 170500);
        a1.displayAirforce();
        System.out.println("======================================================================");

        Navy n1=new Navy("Maharaj","Akola","Naraware",70000,"Sea","VR Chaudhri","50",65000);
        n1.displayNavy();
        System.out.println("=======================================================================");

        Army a2=new Army("Rajesh","AKola","Garware",50000,"Border Pertroling","Vr Chaiydhari","50",900000);
        a2.displayArmy();
        System.out.println("=========================================================================");
    }
}
