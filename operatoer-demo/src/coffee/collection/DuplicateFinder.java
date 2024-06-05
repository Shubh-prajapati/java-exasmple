package coffee.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {
    public static void main(String[] args) {
        int[] array={10,20,12,18,14,14,17,18,19,15,20,17};
        int[] duplicates= findDuplicates(array);

        //Pringting the duplicate array
        System.out.println("Duplicates: ");
        for (int num:duplicates){
            System.out.println(num+ " ");
        }
    }
    public  static int[] findDuplicates(int[] array){
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();

        //Finding duplicate
        for (int num:array)
        {
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }

        //Converting set to array
        int[] result =new int[duplicate.size()];
        int index=0;
        for(int num: duplicate){
            result[index++]=num;
        }
        return result;
    }

}
