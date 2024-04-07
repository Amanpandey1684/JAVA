
import java.util.Scanner;

public class inverse_array3 {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int q = qw.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < q; i++) {
            arr[i] = qw.nextInt();
        }
        reverse(arr);
    }

    public static void reverse(int arr[]) {
        int i = 0;
        int[] new1 = new int[arr.length];
        while (i < arr.length) {
            new1[arr[i]] = i;
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(new1[j] + " ");
        }

    }
}
