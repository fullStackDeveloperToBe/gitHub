package com.java.doubt.check;

import java.util.HashMap;

public class TwoAdd {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> d = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (d.get(nums[i]) != null) {
                int[] output = new int[2];
                output[0] = i;
                output[1] = d.get(nums[i]);
                return output;
            }
            else {
                d.put(target - nums[i], i);
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums, 9);
        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }
    }
}
