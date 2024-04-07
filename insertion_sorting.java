public class insertion_sorting {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4 };
        sort(arr);
    }

    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            j++;
            arr[j] = element;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
