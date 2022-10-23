package com.java.search;

public class LinearSearch {

    static int linearSearch(int[] arr, int val) {

        if(arr.length == 0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++) {
            if(val == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-13, -457, 34, 54, 12, 17, 46, 76, 78, 45};
        int val = -457;
        int ans = linearSearch(arr, val);
        System.out.println(ans);
    }
}
