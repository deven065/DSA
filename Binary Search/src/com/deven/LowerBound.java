package com.deven;

public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        int x = 2;
        int ans = lowerBound(nums, x);
        System.out.println(ans);
    }
    static int lowerBound(int[] nums, int x) {
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (x > nums[mid]) { // difference between lower bound and upper bound is only this condition
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
