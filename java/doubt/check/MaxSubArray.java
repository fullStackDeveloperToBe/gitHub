package com.java.doubt.check;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> lis = new ArrayList<>();
        ArrayList<List<Integer>> li = sub(arr, n, k);
        //System.out.println(li);
        return lis;

    }

    public static ArrayList<List<Integer>> sub(int arr[], int n, int k) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n-2;i++) {
            for(int j=i;j<=i+2;j++) {
                l.add(arr[j]);
            }
            //System.out.println(list);
            list.add(l);

            System.out.println(list);
        }
        return list;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,2,3,6};
        int n = arr.length, k =3;
        max_of_subarrays(arr, n ,k);

    }
}
