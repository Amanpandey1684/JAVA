public class oppsq18 {
    public static void main(String[] args) {
        int n = 5;
        // outer loop for the rows
        for (int i = 1; i <= n; i++) {
            // loop for the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            } // loop for the 1st half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } // loop for the 2nd half stars
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // outer loop for the rows
        for (int i = n; i >= 1; i--) {
            // loop for the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            } // loop for the 1st half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } // loop for the 2nd half stars
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
