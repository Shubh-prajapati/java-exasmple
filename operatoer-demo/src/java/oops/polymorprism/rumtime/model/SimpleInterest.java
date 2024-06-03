package java.oops.polymorprism.rumtime.model;

import java.oops.polymorprism.rumtime.implementation.Interest;

public class SimpleInterest implements Interest {
    public double calculate (double interstRate,int principalerate, int year){

        return principalerate * (interstRate / 100) * year;
    }

    public double calculate (double interstRate,int principalerate){

        return principalerate * (interstRate / 100);
    }

}
