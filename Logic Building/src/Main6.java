// Find factorial of a number

import java.util.Scanner;

public class Main6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        long ans = factorial(n);
        System.out.println(ans);
        sc.close();
    }
    static long factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
