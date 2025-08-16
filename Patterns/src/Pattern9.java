public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half (excluding middle duplicate row)
        for (int i = 0; i < n - 1; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Middle two identical rows
        for (int i = 0; i < 2; i++) {
            // No spaces
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
