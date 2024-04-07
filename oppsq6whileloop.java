public class oppsq6whileloop {
    public static void main(String[] args) {
        int n = 5;
        int row_no = 1;
        int cstar = n;
        int cspace = 0;
        while (row_no <= n) {
            int space = 1;
            while (space <= cspace) {
                System.out.print("  ");
                space = space + 1;
            }
            int star = 1;
            while (star <= cstar) {
                System.out.print("* ");
                star = star + 1;
            }
            row_no = row_no + 1;
            cspace = cspace + 2;
            cstar = cstar - 1;
            System.out.println();
        }
    }
}
