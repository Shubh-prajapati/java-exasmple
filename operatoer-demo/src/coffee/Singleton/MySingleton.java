package coffee.Singleton;

public class MySingleton {


    private static MySingleton instance;

    private MySingleton(){
        System.out.println("Singleton Instance Creation");
    }

    public static MySingleton getInstance(){
        if(instance == null){
            instance = new MySingleton();
        }
        return instance;
    }


    public void showMessage(){

        System.out.println("This is Singleton Class");
    }
}
