import java.util.Scanner;

public class dominopiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = n * m / 2;
        System.out.print(ans);
        sc.close();
    }

}
