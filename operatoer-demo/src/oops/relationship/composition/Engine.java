package oops.relationship.composition;

public class Engine {
    public String fuel;
    public int cc;
    public int Stack;
    public String transmition;
    public double torque;
   public int hp;
    public int cylinder;

   Engine(){}; // default Constructor

    public Engine(String fuel,int cc, int Stack,String transmition, double torque, int hp,int cylinder)
    {
        this.fuel=fuel;
        this.cc=cc;
        this.Stack=Stack;
        this.transmition=transmition;
        this.torque=torque;
        this.hp=hp;
        this.cylinder=cylinder;

    }
public  void displayEngine()
{
    System.out.println("Fuel :"+fuel);
    System.out.println("CC :"+cc);
    System.out.println("Stack :"+Stack);
    System.out.println("Tramsmition :"+transmition);
    System.out.println("Torwque :"+torque);
    System.out.println("HP :"+hp);
    System.out.println("Cylinder :"+cylinder);
}

}
