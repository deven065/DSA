package com.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = sum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int[] nums, int target) {
        // run a for loop over the 0th index
        for (int i = 0; i < nums.length-1; i++) {
            // run a for loop over the next index of i
            for (int j = i+1; j < nums.length; j++) {
                // condition
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
