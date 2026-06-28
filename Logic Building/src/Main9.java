// Check if a number is palindrome

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans);
    }
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        return original == reverse;
    }
}
