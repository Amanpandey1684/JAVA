public class oppsq5 {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop for each row
        for (int i = 0; i <= n; i++) {
            // Inner loop for spaces
            for (int j = 0; j <= i; j++) {
                System.out.print("  "); // Two spaces for formatting
            }

            // Inner loop for asterisks
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}
