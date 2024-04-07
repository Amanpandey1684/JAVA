
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = qw.nextInt();
        }
        int fnd = qw.nextInt();
        System.out.println(binary(arr, 0, n - 1, fnd));

    }

    public static int binary(int[] arr, int first, int last, int fnd) {
        int median = (first + last) / 2, index = -1;
        while (first <= last) {
            if (arr[median] < fnd) {
                first = median + 1;
            } else if (arr[median] == fnd) {
                index = median;
                break;
            } else {
                last = median - 1;
            }
            median = (first + last) / 2;
        }
        return index;
    }
}
