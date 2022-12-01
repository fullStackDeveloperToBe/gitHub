package com.java.array;

public class LinearSearch {

    public static boolean linearSearch(int[] arr, int s) {
        for(int i=0;i<arr.length;i++) {
            if(s == arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,88,34,98,125};
        int k = 121;
        System.out.println((linearSearch(arr, k)));
    }
}
