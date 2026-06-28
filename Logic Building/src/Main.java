//  Q1: Print nos. from 1 to N
import java.util.*;

class  Main {
    public static void main(String[] args) {
        //  Initialise Scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");

        //  Store input from the user in n
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        //  Closing Scanner resources
        sc.close();
    }
}