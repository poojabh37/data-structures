package difficulty.school.numbers;

import java.util.Scanner;

public class NumberOfFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int num = sc.nextInt();
            int factors = getNumOfFactors(num);
            System.out.println(factors);
        }
    }

    private static int getNumOfFactors(int num) {
        int factors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors++;
        }
        return factors;
    }
}
