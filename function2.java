import java.util.Scanner;

public class function2 {
    public static int calculateproduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateproduct(a, b);
        System.out.println("the product of the two nos. are: " + product);

    }
}
