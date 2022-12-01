package com.java.doubt.check;

import java.util.ArrayList;
import java.util.List;

public class FindIndex {

    static int findIndex(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<arr.length;i++) {
            if((arr[i-1] < arr[i])) {
                if((arr[i] < arr[i+1]))
                    list.add(arr[i]);
            }
            else {
                return -1;
            }
        }
        return list.get(0);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7};
        System.out.print(findIndex(arr));
    }
}
