package com.java.doubt.check;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nov22 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,45,98,67,34,1,0,-45);
        List<Integer> list2 = Arrays.asList(34,21,67,9,34,100,-234);

        Stream<Integer> streamMerge = Stream.concat(list1.stream(), list2.stream());
        List<Integer> allElements = streamMerge.collect(Collectors.toList());
        System.out.println(allElements);

        Set<Integer> uniqueEmelents = allElements.stream().collect(Collectors.toSet());
        System.out.println(uniqueEmelents);

        Integer min = uniqueEmelents.stream().min((x1, x2) -> x1-x2).get();
        System.out.println(min);
        Integer max = uniqueEmelents.stream().max((x1, x2) -> x1-x2).get();
        System.out.println(max);
     }
}
