package problems.school.numbers.basic;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int a : arr) {
                a = sc.nextInt();
            }

            reverseArray(arr, n);

            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }

    private static void reverseArray(int arr[], int n) {
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
