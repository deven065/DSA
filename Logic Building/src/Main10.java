//  Check if a number is prime

import java.util.Scanner;

public class Main10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        sc.close();
    }
    static boolean isPrime(int n) {
        //  Negative numbers are not prime numbers
        if (n <= 1) {
            return false;
        }
        //  Loop will start to check from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
