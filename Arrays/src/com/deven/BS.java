package com.deven;

public class BS {
    public static void main(String[] args) {
        int[] arr= {1, 2, 5, 8, 10, 14, 20};
        int target = 8;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
