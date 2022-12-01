package com.java.doubt.check;

import java.util.ArrayList;

public class SubArray {

    public static ArrayList<Integer> subArray(int[] arr, int sum) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int su=0,s=0,e=-1;
        for(int i=0;i<n;i++) {
            su = su+arr[i];
            e++;
            while(su>sum) {
                System.out.print(su+"=");
                su = su-arr[s];
                s++;
            }
            if(su == sum) {
                list.add(s+1);
                list.add(e+1);
                break;
            }
        }
        if(list.size() == 0) {
            list.add(-1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 9;
        subArray(arr, sum);

    }
}
