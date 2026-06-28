import java.util.Arrays;

public class MissingNumber {
    static void main() {
        int[] nums = {0, 2, 1, 4};
        int ans = missingNumber(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        //  Find the missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        //  [4, 2, 1, 0] answer should be [0, 1, 2, 3, 4] that's why nums.length is returned
        return nums.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
