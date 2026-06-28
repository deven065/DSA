public class LowerBound {
    static void main() {
        int[] nums = {3, 5, 8, 15, 19};
        int target = 9;
        int ans = lowerBound(nums, target);
        System.out.println(ans);
    }
    static int lowerBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
