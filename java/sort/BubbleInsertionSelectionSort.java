package com.java.sort;

public class BubbleInsertionSelectionSort {

    static void bubbleSort(int[] arr, int n) {
        int temp;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    static void insertionSort(int[] arr, int n) {
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            int lastIndex = n-i-1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int i, int j) {
        int temp=0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0, -44, -99};
        int n = arr.length;
//        bubbleSort(arr, n);
//        print(arr, n);
//        insertionSort(arr, n);
//        print(arr, n);
        selectionSort(arr, n);
        print(arr, n);
    }
}
