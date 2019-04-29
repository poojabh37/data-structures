package difficulty.school.numbers.matrices;

import java.util.Scanner;

public class DiffBwSumOfDiagonals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int arr[][] = new int[size][size];

            int sumA = 0;
            int sumB = 0;
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    arr[j][k] = sc.nextInt();
                    if (j == k) {
                        sumA += arr[j][k];
                    }
                    if (j + k == size - 1) {
                        sumB += arr[j][k];
                    }
                }
            }
            int diff = sumA - sumB;
            if (diff < 0) {
                diff = -diff;
            }
            System.out.println(diff);
        }
    }
}
