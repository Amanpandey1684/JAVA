import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of available roses
            int[] prices = new int[N]; // Prices of roses

            for (int i = 0; i < N; i++) {
                prices[i] = scanner.nextInt();
            }

            int M = scanner.nextInt(); // Amount of money Deepak has

            findRosesPair(prices, M);

            if (t < T - 1) {
                System.out.println(); // Print a blank line after each test case
            }
        }
    }

    public static void findRosesPair(int[] prices, int money) {
        Arrays.sort(prices); // Sort the prices in ascending order
        int left = 0, right = prices.length - 1;

        int rose1 = -1, rose2 = -1; // Initialize variables to store the selected roses

        while (left < right) {
            int currentSum = prices[left] + prices[right];

            if (currentSum == money) {
                rose1 = prices[left];
                rose2 = prices[right];
                break;
            } else if (currentSum < money) {
                left++;
            } else {
                right--;
            }
        }

        if (rose1 != -1 && rose2 != -1) {
            System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
        }
    }
}
