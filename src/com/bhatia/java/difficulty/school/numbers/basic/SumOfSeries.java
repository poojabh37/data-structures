package difficulty.school.numbers.basic;

import java.util.Scanner;

public class SumOfSeries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int num = sc.nextInt();
            int sum = sumOfSeries(num);
            System.out.println(sum);
        }
    }

    private static int sumOfSeries(int n) {
        return n * (n + 1) / 2;
    }

    //sum of series
    //   = n/2 * {2a + (n-1)d}
}
