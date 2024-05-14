package WapperClass;


public class WapperClassDemo {
    public static void main(String[] args) {
        // primitive Data Type
        int intNo=25;
        float floatNo=25.25f;
        double doubleNo=25.789654123;
        char character='a';
        byte aByte='a';
        boolean flag=false;
        long longId=8796541236522L;
        short shortNo=254;


        // Non-primitive(wapper class) data Type
        //auto Boxing

        Integer integerWapperNo=intNo;
        Float   floatWapperNo=floatNo;
        Double doubleWapperNo=doubleNo;
        Character characterNo=character;
        Byte byteWapperNo=aByte;
        Boolean booleanWapper=flag;
        Long longWapperId=longId;
        Short shortWapperNo=shortNo;

        System.out.println("\nIneger integerWapperClassNo: "+integerWapperNo+
                            "\nFloat floatWrapperNo: "+floatWapperNo+
                            "\nDouble doubleWapperNo " +doubleWapperNo+
                            "\nCharacter charcaterNo "+ characterNo+
                            "\nByte byteWapperNo "+ byteWapperNo+
                            "\nLong longWapperNo "+longWapperId+
                            "\n Short shortWapperNo "+shortWapperNo
        );
        System.out.println("--------------------------------------------------------");

         //unboxing
        int primitiveIntNo=integerWapperNo;
        System.out.println("\nint primitiveIntNo :"+primitiveIntNo);

    }
}
