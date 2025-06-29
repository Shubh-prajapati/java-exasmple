package coffee.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        MySingleton obj= MySingleton.getInstance();
        obj.showMessage();

//        MySingleton obj2=new MySingleton();

        MySingleton obj1=MySingleton.getInstance();

        System.out.println("This is Singleton class? "+(obj == obj1));
    }
}
