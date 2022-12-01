package com.java.doubt.check;

public class Kadane {

    static int kadane(int[] arr) {
        int currentValue=0,maxValue=0;
        for(int i=0;i<arr.length;i++) {
            currentValue = currentValue+arr[i];
            if(currentValue>maxValue) {
                maxValue = currentValue;
            }
            if(currentValue<0) {
                currentValue = 0;
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }

    static long maxSubarraySum(int arr[]){

        // Your code here
        int size = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println(max_so_far);
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, -1, -2, -3 };
        //kadane(arr);
        maxSubarraySum(arr);
    }
}
