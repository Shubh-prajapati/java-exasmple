package coffee.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        List<Integer> numberlist=new ArrayList<>();
        Collections.addAll(numberlist, 54,65,1239,98,9872,16487,258,2741,87);

        //java.collection.copy -> copies the elements in destination java.collection from sources
        System.out.println("Lowest number in list: "+Collections.min(numberlist));
        System.out.println("Highest number in list "+Collections.max(numberlist));

        Collections.sort(numberlist);
        System.out.println("Sorted List: "+numberlist);

        Collections.reverse(numberlist);
        System.out.println("Reverse list: "+numberlist);
//        System.out.println("Swap List: "+numberlist);

        Collections.rotate(numberlist,1);
        System.out.println("Rotate Operation :" +numberlist);

        Collections.replaceAll(numberlist,87,19);
        System.out.println("replaceALl Operation: "+numberlist);

        Collections.shuffle(numberlist);
        System.out.println("Current List After shuffle: "+numberlist);

        System.out.println("--------------------------------------------------");
        for(int index=0; index<numberlist.size(); index++)
        {
            System.out.println("Next Element in the List: "+numberlist);
            if (index==3)
            {
                numberlist.add(9999);
            }
        }
        System.out.println("Current List: "+numberlist);

        System.out.println("---------------------------------");

        try {
            Iterator<Integer> numberListInterator = numberlist.iterator();
            while (numberListInterator.hasNext()) {
                int currentNo = numberListInterator.next();
                System.out.println("next element in newCitiesList: " + currentNo);
                numberlist.add(currentNo + 1);

            }
        }catch (Exception exception) {
            CopyOnWriteArrayList copyOnWriteNumberList=new CopyOnWriteArrayList();
            copyOnWriteNumberList.addAll(numberlist);
            Iterator<Integer> copyOnWriteNumberListInterator = copyOnWriteNumberList.iterator();
            while (copyOnWriteNumberListInterator.hasNext()) {
                int currentNo = copyOnWriteNumberListInterator.next();
                System.out.println("next element in newCitiesList: " + currentNo);
                copyOnWriteNumberList.add(currentNo + 1);

            }
        }
        System.out.println("-------------------------------------------------------");

        Collections.swap(numberlist,0,1);
        System.out.println("Swap Operation: "+numberlist);

        System.out.println("ncopies output: "+Collections.nCopies(2, numberlist));

    }
}
