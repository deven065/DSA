//  Greatest Element in Array Smaller Than Or Equals To Target

public class Floor {
    static void main() {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 6;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target) {
        //  Edge Case: If target < first element return -1
        if(target < arr[0]) {
            return -1;
        }
        //  Apply Binary Search
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
