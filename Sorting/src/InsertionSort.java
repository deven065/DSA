//Insertion Sort divides the array into two parts:
//
//        Left part → Sorted
//        Right part → Unsorted
//
//        During each pass, it picks the first element from the unsorted part and inserts it into its correct position in the sorted part.
//
//        After every iteration, the size of the sorted part increases by one until the entire array becomes sorted.

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        //  pass the for loop from start till second last index
        for (int i = 0; i < arr.length-1; i++) {
            //  pass the for loop from second index till last
            for (int j = i+1; j > 0; j--) {
                //  now check if second index and first index are properly sorted or not if not then swap it and sort it properly
                if (arr[j] < arr[j-1]) {
                    //  swapped
                    swap(arr, j, j-1);
                }
                else {
                    //  If values are properly sorted then break the loop
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
