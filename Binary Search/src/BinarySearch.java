void main() {
    int[] arr = {1, 2, 4, 8, 10};
    int target = 4;
    int ans = binarySearch(arr, target);
    System.out.println(ans);
}
static int binarySearch(int[] arr, int target) {
    if (arr.length == 0) {
        return -1;
    }
    int start = 0;
    int end = arr.length-1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}