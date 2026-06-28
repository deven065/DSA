import java.util.Arrays;

public class ReverseAnArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        for (int i = start; i <= end; i++) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}