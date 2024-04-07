import java.util.Scanner;

public class function_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = count(n);
        if (isArm(n, count)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static boolean isArm(int n, int count) {
        int ans = 0;
        int backup = n;
        while (n != 0) {
            int digit = n % 10;
            ans += (int) Math.pow(digit, count);
            n = n / 10;
        }
        System.out.println(ans);
        return backup == ans;
    }

}
