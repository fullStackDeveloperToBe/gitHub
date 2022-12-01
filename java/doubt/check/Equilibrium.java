package com.java.doubt.check;

public class Equilibrium {

    static int equilibrium(int[] arr, int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }

        int leftSum = 0;
        int rightSum = sum-arr[0];

        if(leftSum == rightSum) {
            return 1;
        }

        for(int i=1;i<n;i++) {
            leftSum+=arr[i-1];
            rightSum-=arr[i];
            if(rightSum == leftSum) {
                return i+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3};
        int n = arr.length;
        System.out.print(equilibrium(arr, n));
    }
}
