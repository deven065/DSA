//  Smallest Number in Array Greater Than Or Equals To Target

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 6;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target) {
        if(target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
