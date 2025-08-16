public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) { // Loop for each row
            for (int j = 0; j < 4; j++) { // Loop for each column
                System.out.print("* "); // Print * with 1 space in the pattern
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}