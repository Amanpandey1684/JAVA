
import java.util.Scanner;

public class demo123 {

    public static void main(String[] args) {
        int n = 4; // Number of rows in the pattern

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print the numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }

            // Print the spaces in the middle
            for (int j = 2 * (n - i); j >= 1; j--) {
                System.out.print("\t");
            }

            // Print the numbers in decreasing order
            for (int j = i - 0; j >= 1; j--) {
                System.out.print(j + "\t");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
