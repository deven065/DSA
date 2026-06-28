public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 4};
        int ans = cyclicSort(arr);
        System.out.println(ans);
    }
    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //  find the duplicate number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return arr[index];
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
