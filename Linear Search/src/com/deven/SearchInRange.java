package com.deven;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 3, 5, 7, 9};
        int target = 5;
        System.out.println(search(arr, 0, 4, target));
    }
    static int search(int[] arr, int start, int end, int target) {
        // edge case
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
