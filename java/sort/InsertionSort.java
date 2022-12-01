package com.java.sort;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j>0;j--) {

            }
        }
    }

    static void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {32, 12, 3, -45, -100};
        insertionSort(arr);
    }
}
