//  1295. Find Numbers with Even Number of Digits
//  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    //  Function to count number of digits in a number
    static int Digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    //  Function to check the number is even or not
    static boolean even(int num) {
        int numberOfDigits = Digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
}
