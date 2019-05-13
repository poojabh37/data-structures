package problems.school.numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            checkPrime(num);
        }
    }

    private static void checkPrime(int num) {
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}