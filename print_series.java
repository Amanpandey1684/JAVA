
import java.util.Scanner;

public class print_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        int ii = 1, no = 1;
        while (ii <= n) {
            int kk = 3 * no + 2;
            if (kk % x != 0) {
                System.out.println(kk);
                ii++;
            }
            no++;
        }
    }
}
