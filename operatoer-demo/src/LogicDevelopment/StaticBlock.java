package LogicDevelopment;

import javafx.scene.control.TableColumn;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main begin ");
        System.out.println("Hello World ");
        System.out.println("Main End ");

        System.out.println("==================================");
    }
    static{
        System.out.println("From Block 1");
    }
    static {
        System.out.println("From Static Block 2");
    }
    static
    {
        System.out.println("From Static Block 3");
    }

}
