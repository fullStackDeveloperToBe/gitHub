package com.java.string;

public class Vuram {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int[] arr1 = new int[(arr.length/2)+1];
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i=i+2) {
            int j=0;
            arr1[j] = arr[j]+ arr[i]+arr[i+1];
            j++;
//            for(int j=0;j<arr.length/2+1;j++) {
//                arr[j] = arr[i]+arr[i+1];
//            }
        }
        for(int k : arr1) {
            System.out.print(k+" ");
        }
    }
}
