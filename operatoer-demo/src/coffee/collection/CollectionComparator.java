package coffee.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class CollectionComparator {
    private String name;
    private double gpa;

    public CollectionComparator(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return  gpa;
    }
    public static void main(String[] args) {
        List<CollectionComparator> collectionComparators=new ArrayList<>();
        collectionComparators.add(new CollectionComparator("Alice",3.5));
        collectionComparators.add(new CollectionComparator("Smith",3.2));
        collectionComparators.add(new CollectionComparator("Charlie",3.6));
        collectionComparators.add(new CollectionComparator("Akshit",3.9));


        Comparator<CollectionComparator> comparator=Comparator.comparing(CollectionComparator::getGpa).reversed();
         collectionComparators.sort(comparator);
            for (CollectionComparator c : collectionComparators){
                System.out.println(c.getName()+":" +c.getGpa());
            }

    }
}
