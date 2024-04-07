import java.util.Scanner;

public class Armstrong_between_two_no {

    // Prints Armstrong Numbers in given range
    public static void findArmstrong(int n1, int n2) {
        for (int i = n1 + 1; i < n2; i++) {

            // number of digits calculation
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                n++;
            }

            // compute sum of nth power of
            // its digits
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }

            // checks if number i is equal
            // to the sum of nth power of
            // its digits
            if (pow_sum == i)
                System.out.print(i + " ");
        }
    }

    // Driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        findArmstrong(num1, num2);
        System.out.println();
    }
}
