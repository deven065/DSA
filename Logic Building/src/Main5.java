//  Find sum of first N natural numbers

import java.util.Scanner;

public class Main5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = n * (n+1)/2;
        System.out.println(sum);
    }
}
