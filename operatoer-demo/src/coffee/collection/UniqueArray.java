package coffee.collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueArray {
    public static void main(String[] args) {
        int [] array1={10,20,12,18,14};

        int [] array2={12,10,16,22,12};

        //create A set to store unique elements
        Set<Integer> uniqueElements =new HashSet<>();

        // Add elements from the first array
        for(int num: array1){
            uniqueElements.add(num);
        }

        //Add elements from the second java.Array
        for(int num: array2)
        {
            uniqueElements.add(num);
        }

        //Convert the set to an array
        int[] uniqueArray=new int[uniqueElements.size()];
        int index=0;
        for (int num: uniqueElements){
            uniqueArray[index++]=num;

        }

        //Output the result
        System.out.print("Output : ");
        for (int num: uniqueArray){
            System.out.print(num+" ");
        }

    }
}
