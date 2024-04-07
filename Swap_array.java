
//PASS BY VALUE WHERE THE VALUE WILL NOT BE SWAPED
public class Swap_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int brr[] = { 6, 7, 8, 9, 1 };
        System.out.println(arr[0] + " " + brr[0]);
        swap(arr, brr);
        System.out.println(arr[0] + " " + brr[0]);
    }

    public static void swap(int a[], int b[]) {
        int c[] = a;
        a = b;
        b = a;
    }

}
