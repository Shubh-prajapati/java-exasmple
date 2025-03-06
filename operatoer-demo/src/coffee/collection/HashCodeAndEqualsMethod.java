package coffee.collection;

import coffee.accessModifier.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {

    public static void main(String[] args) {
        HashMap<People,String>map=new HashMap<>();
        People p1=new People("Shubham",101);
        People p2=new People("Prakash",102);
        People p3=new People("Shubham",101);

        map.put(p1,"Engineer"); //hashcode --> index1
        map.put(p2,"Doctor"); //hashcode --> index2
        map.put(p3,"Teacher");// hashcode --> index3


        System.out.println("HashMap Size:" +map.size());
        System.out.println("Value for p1:" +map.get(p1));
        System.out.println("Value for p3:" +map.get(p3));




        Map<String ,Integer> map1=new HashMap<>();
        map1.put("Shubham", 90); //hashcode --> index
        map1.put("Tushar",94); //hashcode --> index
        map1.put("Shubham",99); // hashcode1 --> index ---> equals() ---> replace it replace the value with the help of the equals()


    }
}

class People{
    private String name;
    private  int id;

    public People(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
       if (this==object){
           return true;
       }
       if (object == null){
           return false;
       }

       People other  =(People) object;
       return id==other.getId()&& Objects.equals(name,other.getName());


    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
