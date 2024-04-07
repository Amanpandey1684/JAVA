public class oppsq12 {
    public static void main(String[] args) {
        int n = 5; // loops Number of rows

        for (int i = 1; i <= n; i++) {
            // loop for the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // loop for stars and exclamation marks
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k % 2 == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ! ");
                }
            }

            System.out.println();
        }
    }
}
