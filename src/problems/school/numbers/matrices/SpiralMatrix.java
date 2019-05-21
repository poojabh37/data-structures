package problems.school.numbers.matrices;

import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 7;
        int n = 3;
        int arr[][] = new int[m][n];

        int num = 1;
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                arr[j][k] = num;
                num++;
            }
        }
        printSpiral(arr, m, n);
    }

    private static void printSpiral(int[][] arr, int row, int col) {
        int i = 0;
        int j = 0;

        int iStart = 0;
        int jStart = 0;
        while (iStart < row && jStart < col) {
            i = iStart;
            j = jStart;
            while (j < col) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            iStart++;

            if (iStart < row) {
                j--;   //down
                i++;
                while (i < row) {
                    System.out.print(arr[i][j] + " ");
                    i++;
                }
            } else {
                break;
            }

            if (j >= jStart) {
                i--;    //left
                j--;
                while (j >= jStart) {
                    System.out.print(arr[i][j] + " ");
                    j--;
                }
            } else {
                break;
            }


            i--;   //up
            j++;
            while (i >= iStart) {
                System.out.print(arr[i][j] + " ");
                i--;
            }
            col--;
            jStart++;
            row--;
        }
    }


}
