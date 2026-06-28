public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 14, 28};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int lowest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        return lowest;
    }
}
