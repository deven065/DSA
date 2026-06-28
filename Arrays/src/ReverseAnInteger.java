public class ReverseAnInteger {
    static void main() {
        int x = 12345;
        int ans = reverse(x);
        System.out.println(ans);
    }
    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }
}