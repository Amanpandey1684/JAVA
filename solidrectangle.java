public class solidrectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // outer loop for no. of rows
        for (int i = 1; i <= n; i++) {
            // innner loop for the stars
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            // for next line
            System.out.println();
        }
    }

}
