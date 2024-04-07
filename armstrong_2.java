import java.util.Scanner;

public class armstrong_2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.:-");
        int q = sc.nextInt();
        sc.close();
        int q1 = q, q2 = q, p = 0;
        while (q > 0) {
            q /= 10;
            p++;
        }
        int sum = 0;
        while (q1 != 0) {
            int rem = q1 % 10;
            double w = Math.pow(rem, p);
            int k = (int) w;
            sum = k + sum;
            q1 /= 10;
        }
        if (sum == q2) {
            System.out.println("Armstrong no.");
            System.out.println(q2);
        } else {
            System.out.println("Not a Armstrong no.");
            System.out.println(q2);
        }
    }
}
