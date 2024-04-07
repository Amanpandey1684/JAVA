public class diamondpattern {
    public static void main(String[] args) {
        int n = 4;
        /*
         * for (int i = 1; i <= n; i++) {
         * // spaces
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // 1st half
         * for (int j = i; j >= 1; j--) {
         * System.out.print("*");
         * }
         * // 2nd half
         * for (int j = 2; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * // lower half
         * for (int i = n; i >= 1; i--) {
         * // spaces
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // 1st half
         * for (int j = i; j >= 1; j--) {
         * System.out.print("*");
         * }
         * // 2nd half
         * for (int j = 2; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         */

        // upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
