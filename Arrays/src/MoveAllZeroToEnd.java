import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 1, 2};
        move(arr);
        System.out.println(Arrays.toString(arr));
        // ans = [1, 3, 1, 2, 0, 0];
    }
    static void move(int[] arr) {
        //  position to place non-zero
        int ans = 0;
        //  Step 1: Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[ans] = arr[i];
                ans++;
            }
        }
        //  Step 2: Fill remaining with zeros
        while (ans < arr.length) {
            arr[ans] = 0;
            ans++;
        }
    }
}