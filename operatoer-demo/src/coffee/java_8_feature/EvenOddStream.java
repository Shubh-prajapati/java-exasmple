package coffee.java_8_feature;


import coffee.oops.polymorprism.rumtime.implementation.Interest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

//        List<Integer> list= Arrays.stream(arr).boxed().toList();
//
//        List<List<Integer>> checklist=list.stream()
//                .collect(Collectors.groupingBy(x->x % 2==0))
//                .entrySet().stream()
//                .map(x-> x.getValue())
//                .collect(Collectors.toList());
//        System.out.println(checklist);


        List<Integer> list=Arrays.stream(arr).boxed().toList();

        List<List<Integer>> checklist=list.stream().collect(Collectors.groupingBy(x->x%2==0))
                .entrySet().stream()
                .map(x->x.getValue())
                .collect(Collectors.toList());
        System.out.println(checklist);


      }
}
