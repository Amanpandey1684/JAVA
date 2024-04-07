import java.util.Scanner;

public class soilderandbanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // Cost of the first banana
        int n = scanner.nextInt(); // Initial dollars soldier has
        int w = scanner.nextInt(); // Number of bananas soldier wants

        // Calculate the total cost of w bananas
        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }

        // Calculate the amount of money soldier needs to borrow
        int borrowAmount = Math.max(0, totalCost - n);

        System.out.println(borrowAmount);
    }
}
