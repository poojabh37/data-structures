package difficulty.school.numbers;

import java.util.Scanner;

public class MaxMinArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            findLargest(arr);
        }
    }

    private static void findLargest(int[] arr) {
        int large = -1;
        int smallest = arr[0];
        for (int num : arr) {
            if (num > large)
                large = num;
            if (num < smallest)
                smallest = num;
        }
        System.out.println(large + " " + smallest);
    }
}
