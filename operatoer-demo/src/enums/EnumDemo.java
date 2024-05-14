package enums;

import java.sql.SQLOutput;

public class EnumDemo {
    public static void main(String[] args) {
        Address address=new Address();
        address.city="pune";
        address.pincode=411250;
        address.direction= Address.Direction.WEST;

        System.out.println("address: "+address);



    }
}
