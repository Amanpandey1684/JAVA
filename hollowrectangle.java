public class hollowrectangle {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*" + "\t");
                } else if (i == n - 3 || i == n - 1) {
                    if (j == n - 3 || j == n - 1) {
                        System.out.print("*" + "\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
