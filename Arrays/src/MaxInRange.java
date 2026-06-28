public class MaxInRange {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = maxinRange(arr, 1, 4);
        System.out.println(ans);
    }
    static int maxinRange(int[] arr, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        if (start < 0 || end >= arr.length || start > end) {
            return -1;
        }
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}