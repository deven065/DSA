public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int target = 8; // output = 3
        int ans = searchInsert(arr, target);
        System.out.println(ans);
    }
    public static int searchInsert(int [] arr, int target){
        if (arr[arr.length-1] < target) {
            return arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < target && arr[i] > target) {
                return i;
            }
        }
        return 0;

    }
}