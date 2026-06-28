void main() {
    int[] arr = {4, 5, 1, 2, 3};
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
}
//  Function for Selection Sort
static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        //  Find the max item in the remaining array and swap with the correct index
        int last = arr.length-1-i;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);
    }
}
//  Function to the Maximum element in the array
static int getMaxIndex(int[] arr, int start, int end) {
    int max = 0;
    for (int i = start; i <= end; i++) {
        if (arr[max] < arr[i]) {
            max = i;
        }
    }
    return max;
}
//  Function to swap the elements
static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}