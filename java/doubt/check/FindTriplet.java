package com.java.doubt.check;

public class FindTriplet {

    public static boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        int c=0,sum=0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
            c++;
            if(c==3 && sum==0) {
                return true;
            }
            if(c==3) {
                c--;
                sum-=arr[i-2];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        System.out.print(findTriplets(arr, n));
    }
}
