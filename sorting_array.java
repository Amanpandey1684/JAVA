//Sort just 0 and 1

//Input Format
//A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space

//Constraints
//N will not exceed 10^7

//Output Format
//Sorted Sequence

//Sample Input
//7
//1 0 0 1 1 0 1
//Sample Output
//0 0 0 1 1 1 1

import java.util.Scanner;

public class sorting_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.print("Array elements after sorting:-");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[n - 1]);

    }
}
