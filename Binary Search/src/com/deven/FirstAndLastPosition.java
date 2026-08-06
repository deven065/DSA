https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.deven;

import java.util.Arrays;

public class FirstAndLastPosition {
    static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        //  initializing ans = [-1, -1];
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] !=  -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean firstIndex) {
        //  initializing ans = -1;
        int ans = -1;
        //  Apply normal binary search
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //  Potential ans found
                ans = mid;
                if(firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
