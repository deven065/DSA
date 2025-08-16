package com.deven;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10, 12};
        int target = 6;
        int ans = bS(arr, target);
        System.out.println(ans);
    }
    static int bS(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}