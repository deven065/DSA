package com.deven;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        System.out.println(minimum(nums));
    }
    static int minimum(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
