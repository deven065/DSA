package com.deven;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxRange(arr, 0, 4));
    }
    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}