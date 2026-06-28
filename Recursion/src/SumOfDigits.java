public class SumOfDigits {
    static void main(){
        int n = 1234;
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n) {
        //  Base Condition
        if (n == 0) {
            return 0;
        }
        //  Recursive Condition
        return (n % 10) + sumOfDigits(n / 10);
    }
}
