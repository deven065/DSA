import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        int ans = missingNumber(nums);
        System.out.println("Question is : " + Arrays.toString(nums));
        System.out.println("Answer is " + ans);
    }
    static int missingNumber(int[] nums) {
        // Use Cyclic sort to sort the array
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // Find the Missing Number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
    // swap function
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
