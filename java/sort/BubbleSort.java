package com.java.sort;

public class BubbleSort {

    static void bubbleSort(int[] arr, int n) {
        int temp = 0;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("after "+i+" pass ->");
            print(arr);
            System.out.println();
        }
    }

    static void insertionSort(int[] arr, int n) {
        for(int i=0;i<n;i++) {

        }
    }

    static void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {45, 65, 12, 4};
        int n = arr.length;
        bubbleSort(arr, n);
        print(arr);
    }
}
