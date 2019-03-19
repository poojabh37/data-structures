package basic.test;

import java.util.Scanner;

public class FibonacciSeriesRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            printFactorial(n);
        }
    }

    private static void printFactorial(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    private static int fib(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return fib(i - 1) + fib(i - 2);
    }
}
