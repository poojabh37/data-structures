package problems.school.numbers.test;

import java.util.Arrays;
import java.util.Scanner;

public class PrintExcept2LargestAray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            findGreatest2(arr);
        }
    }

    private static void findGreatest2(int[] arr) {
        Arrays.sort(arr);
        printExceptGreatest2(arr);
    }


    private static void printExceptGreatest2(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

