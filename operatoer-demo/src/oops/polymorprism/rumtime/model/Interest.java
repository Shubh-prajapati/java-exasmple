package oops.polymorprism.rumtime.model;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Interest {
    public double calculate (double interstRate,int principalerate, int year){

        return principalerate * (interstRate / 100) * year;
    }

    public double calculate (double interstRate,int principalerate){

        return principalerate * (interstRate / 100);
    }

}
