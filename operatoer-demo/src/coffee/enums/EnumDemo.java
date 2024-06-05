package coffee.enums;


public class EnumDemo {
    public static void main(String[] args) {
        Address address=new Address();
        address.city="pune";
        address.pincode=411250;
        address.direction=Address.Direction.SOUTH;
        System.out.println("address: "+address);

        Address address1=new Address();
        address1.city="Akola";
        address1.pincode=444002;
        address1.direction=Address.Direction.EAST;
        System.out.println("address: "+address1);


        Address address2=new Address();
        address2.city="Shegoun";
        address2.pincode=444025;
        address2.direction=Address.Direction.NORTH;
        System.out.println("address: "+address2);

        Address address3=new Address();
        address3.city="Mumbai";
        address3.pincode=456321;
        address3.direction=Address.Direction.WEST;
        System.out.println("address: "+address3);




    }
}
