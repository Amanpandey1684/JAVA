import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int digits = n % 10;
            sum += digits;
            n = n / 10;
        }
        System.out.println(sum);
    }
}