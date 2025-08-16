package com.deven;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int target = 6;
        System.out.println(findNumber(nums, target));
    }
    static int findNumber(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return target = nums[i];
            }
        }
        // this line will execute if none of the return statements from above have executed
        // hence the target not found
        return -1;
    }
}
