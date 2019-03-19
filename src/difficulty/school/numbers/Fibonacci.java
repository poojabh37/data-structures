package difficulty.school.numbers;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            printFactorial(n);
        }
    }

    private static void printFactorial(int n) {
        long[] fib = new long[n];
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                fib[i - 1] = 1;
            } else {
                fib[i - 1] = fib[i - 2] + fib[i - 3];
            }
            System.out.print(fib[i - 1] + " ");
        }
        System.out.println();
    }
}
