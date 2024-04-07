import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int dividend = m;
        int divisior = n;
        int remainder = -1;
        while (remainder != 0) {
            remainder = dividend % divisior;
            dividend = divisior;
            divisior = remainder;
        }
        System.out.println(dividend);
    }

}
