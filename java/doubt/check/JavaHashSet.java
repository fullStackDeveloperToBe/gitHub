package com.java.doubt.check;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> lll = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(0);
        set.add(4);
        set.add(5);
        set.add(-34);
        System.out.println(set);
    }
}
