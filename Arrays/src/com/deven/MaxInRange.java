package com.deven;

public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(MaxRange(arr, 0, 4));
    }
    static int MaxRange(int[] arr,int start, int end) {
        if (start > end) {
            return -1;
        }
        if (end > arr.length-1) {
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
