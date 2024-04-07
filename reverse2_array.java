public class reverse2_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=========>");
        reverse2(arr);

    }

    public static void reverse2(int arr[]) {
        int narr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            narr[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < narr.length; i++) {
            System.out.print(narr[i] + ' ');
        }
    }

}
