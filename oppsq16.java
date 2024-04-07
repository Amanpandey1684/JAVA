public class oppsq16 {
    public static void main(String[] args) {

        int n = 5;
        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Inner loop for spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // Two spaces for formatting
            }

            // Inner loop for stars
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line for the next row
        }

        // Print lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}