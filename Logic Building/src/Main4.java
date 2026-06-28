// Print Odd numbers from 1 to N

import java.util.Scanner;

public class Main4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i+= 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
