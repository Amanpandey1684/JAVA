public class rotate_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate(arr, 2);
    }

    public static void rotate(int arr[], int k) {
        for (int j = 1; j <= k; j++) {
            int c = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
