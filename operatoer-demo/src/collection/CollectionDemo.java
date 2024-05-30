package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        List<Integer> numberlist=new ArrayList<>();
        Collections.addAll(numberlist, 54,65,1239,98,9872,16487,258,2741,87);

        //collection.copy -> copies the elements in destination collection from sources
        System.out.println("Lowest number in list: "+Collections.min(numberlist));
        System.out.println("Highest number in list "+Collections.max(numberlist));
        Collections.sort(numberlist);
        System.out.println("Sorted List: "+numberlist);
        
        System.out.println("ncopies output: "+Collections.nCopies(2, numberlist));



    }
}
