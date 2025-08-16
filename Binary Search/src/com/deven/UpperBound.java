package com.deven;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 5, 7, 9, 10};
        int x = 2;
        int ans = upperBound(nums, x);
        System.out.println(ans);
    }
    static int upperBound(int[] nums, int x) {
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = start + (end - start) /2;
            if (x >= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
