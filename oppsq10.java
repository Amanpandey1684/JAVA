public class oppsq10 {
    public static void main(String[] args) {
        int n = 5;
        // loop for the no. of rows
        for (int i = n; i >= 1; i--) {
            // loop for the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            } // loop for the 1st half of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // loop for the 2nd half of the stars
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
