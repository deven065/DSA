public class SlargestElement {
    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5};
        int ans = sLargestElement(arr);
        System.out.println(ans);
    }
    static int sLargestElement(int[] arr) {
        int largest = arr[0], sLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}
