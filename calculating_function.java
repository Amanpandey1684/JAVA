import java.util.Scanner;

public class calculating_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        if (n % 2 == 0) {
            System.out.print(n / 2);
        } else {
            System.out.print(-(n + 1) / 2);
        }
        System.out.println();
    }

}
