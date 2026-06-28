public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n) {
        //  base condition
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        //  Recursive Condition
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
