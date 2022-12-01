package com.java.doubt.check;

public class TrappingWater {


    static long trappingWater(int arr[], int n) {

        int maxl[] = new int[n];

        int maxr[] = new int[n];

        maxl[0] = arr[0];

        maxr[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {

            maxl[i] = Math.max(maxl[i - 1], arr[i]);

            maxr[n - i - 1] = Math.max(maxr[n - i], arr[n - i - 1]);

        }

        long ans = 0;

        for (int i = 0; i < n; i++) {

            ans += Math.min(maxl[i], maxr[i]) - arr[i];

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,0,9};
        int n = arr.length;
        long uttara = trappingWater(arr,n);
        System.out.println(uttara);
    }
}
