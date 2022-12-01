package com.java.doubt.check;

import java.util.*;

public class PowerProgrammer {

    static int power(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        int count = (int) Math.pow(set.size(), 2);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,3,4,4,3,3,2,23,3,45,6,7,};
        System.out.println(power(arr));
    }
}
