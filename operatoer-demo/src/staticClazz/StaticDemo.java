package staticClazz;

public class StaticDemo {
    public static void main(String[] args) {
        Shape circle1= new Shape();
        circle1.radius=45;
        circle1.type="Circle";
        circle1.print();

        // circle 2nd illutraction
        Shape circle2=new Shape();
        circle2.radius=07;
        circle2.type="Rectangle";
        circle2.print();

        //circle 3 illutraction
        Shape circle3=new Shape();
        circle3.radius=18;
        circle3.type="Square";
        circle3.print();

    }
}
