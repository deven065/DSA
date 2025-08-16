package com.deven;

public class maxValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        if (arr.length == 0) {
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
