package com.deven;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxRange(arr));
    }
    // work on edge cases here, like array being null
    static int maxRange(int[] arr) {
        if (arr == null) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}