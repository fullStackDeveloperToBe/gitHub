package com.java.doubt.check;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static int solution(int arr[], int x)
    {

        // To store the closest sum
        int closestSum = Integer.MAX_VALUE;
        System.out.println(closestSum);

        // Run three nested loops each loop
        // for each element of triplet
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                for(int k = j + 1; k < arr.length; k++)
                {

                    // Update the closestSum
                    if (Math.abs(x - closestSum) >
                            Math.abs(x - (arr[i] + arr[j] + arr[k])))
                        closestSum = (arr[i] + arr[j] + arr[k]);
                }
            }
        }

        // Return the closest sum found
        return closestSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        System.out.print(solution(arr, target));
    }
}
