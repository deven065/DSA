package com.deven;
import java.util.Arrays;

class SearchIn2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        System.out.println(Arrays.toString(searchMatrix(matrix, target))); // prints true or false
    }

    static int[] searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while (r < matrix.length && c >= 0) {
            // case 1:
            if (matrix[r][c] == target) {
                return new int[]{r,c};
                // case 2:
            } else if (matrix[r][c] > target) {
                c--;
                // case 3:
            } else {
                r++;
            }
        }
        return new int[]{-1,-1}; // target not found
    }
}