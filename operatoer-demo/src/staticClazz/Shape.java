package staticClazz;

public class Shape {
    int radius;

    static String type;

    public void print(){
        System.out.println("Radius of the Circle is: "+ radius+ " and Shape is: "+ type);
    }
}
