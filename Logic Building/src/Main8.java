//  Reverse a number

import java.util.Scanner;

public class Main8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int ans = reverseNumber(n);
        System.out.println(ans);
        sc.close();
    }
    static int reverseNumber(int n) {
        if (n < 0) {
            n = -n;
        }
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            reverse = reverse * 10 + rem;
        }
        return reverse;
    }
}
