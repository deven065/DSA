public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    static int factorial(int n) {
        //  Base Condition
        if (n <= 1) {
            return 1;
        }
        //  Recursive Condition
        return n * factorial(n-1);
    }
}