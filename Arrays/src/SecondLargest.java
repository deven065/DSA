public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3};
        int ans = secondMax(arr);
        System.out.println(ans);
    }
    static int max(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    static int secondMax(int[] arr) {
        int largest = max(arr);
        int secondLargest = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}