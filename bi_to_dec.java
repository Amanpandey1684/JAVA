import java.util.Scanner;

public class bi_to_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiplier = 1;
        int result = 0;
        while (n != 0) {
            int rem = n % 2;
            result += (multiplier * rem);
            multiplier *= 2;
            n = n / 10;
            sc.close();
        }
        System.out.println(result);
    }

}
