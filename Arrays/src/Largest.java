public class Largest {
    static void main() {
        int[] arr = {1, 2, 3, 5, 4};
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}