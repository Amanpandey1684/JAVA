import java.util.Scanner;

public class max_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max(arr);
        min(arr);

    }

    public static void max(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(max);
        System.out.println(min);

    }
}