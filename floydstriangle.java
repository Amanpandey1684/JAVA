public class floydstriangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
                m++;
            }
            System.out.println();
        }
    }
}
