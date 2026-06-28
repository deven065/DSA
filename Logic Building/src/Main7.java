// Count digits in a number

import java.util.Scanner;

public class Main7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int ans = countDigit(n);
        System.out.println(ans);
        sc.close();
    }
    static int countDigit(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
        }
        while (n > 0) {
            n = n /10;
            count++;
        }
        return count;
    }
}
