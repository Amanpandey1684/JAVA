public class oppsq25 {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(m + "\t");
                m++;
            }
            System.out.println();
        }
    }
}
