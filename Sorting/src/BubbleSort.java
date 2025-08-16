import java.util.*;

class BubbleSort {

    public static int PrimeChecker(int num) {
        String strNum = Integer.toString(num);
        List<String> perms = new ArrayList<>();
        generatePermutations("", strNum, perms);

        for (String p : perms) {
            int val = Integer.parseInt(p);
            if (isPrime(val)) {
                return 1;
            }
        }
        return 0;
    }

    // Generate all permutations of the number as strings
    static void generatePermutations(String prefix, String remaining, List<String> result) {
        if (remaining.length() == 0 && !prefix.equals("")) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    result
                );
            }
        }
    }

    // Simple prime checker
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println(PrimeChecker(input));
    }
}
