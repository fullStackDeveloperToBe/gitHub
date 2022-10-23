package com.java.sort;

public class BubbleSort {

    static void bubbleSort(int[] arr, int n) {
        int temp;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {45, 65, 12, 4, 23, 0, -34, -99};
        int n = arr.length;
        bubbleSort(arr, n);
        print(arr);
    }
}
