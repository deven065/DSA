import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int ans = duplicateNumber(nums);
        System.out.println("Duplicate Number is : " + ans);
    }
    static int duplicateNumber(int[] nums){
        // Cyclic Sort
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // Find the Duplicate
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return nums[index];
            }
        }
        return -1;
    }
    // swap function
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
