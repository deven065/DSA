public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 6, 1};
        int ans = largestElement(arr);
        System.out.println(ans);
    }
    static int largestElement(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
