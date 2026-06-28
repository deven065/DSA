void main() {
    int[] arr = {3, 1, 5, 4, 2};
    bubbleSort(arr);
    IO.println(Arrays.toString(arr));
}

static void bubbleSort(int[] arr) {
    boolean swapped;
    //  run the steps n-1 times
    for (int i = 0; i < arr.length; i++) {
        swapped = false;
        //  for each step, max item will come at the last respective index
        for (int j = 1; j < arr.length - i; j++) {
            //  swap if the item is smaller than the previous item
            if (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                swapped = true;
            }
        }
        //  if you did not swap for a particular value of i, it means the array is sorted hence stop the program
        if (!swapped) {
            break;
        }
    }
}

static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}