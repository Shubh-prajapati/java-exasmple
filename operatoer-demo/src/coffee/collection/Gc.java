package coffee.collection;


import java.lang.ref.WeakReference;

public  class Gc{
     public static void main(String[] args) {
         WeakReference<Phone> phoneWeakReference=new WeakReference<>(new Phone("Apple","16 pro"));
         System.out.println(phoneWeakReference.get());
         System.gc();
         try{
             Thread.sleep(10000);
         }catch (Exception ignored){

         }
         System.out.println(phoneWeakReference.get());


     }

}
class Phone {
    public  String brand;
    public  String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "WeakReference{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
