package difficulty.school.numbers.recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            int num = input.nextInt();
            for (int i = 0; i < t; i++) {
                long temp = 1;
                long fact = factorial(num, temp);
                System.out.println(fact);
            }
        }
    }

    private static long factorial(int num, long temp) {
        if (num > 0) {
            temp = temp * num;
            return factorial(num - 1, temp);
        }
        return temp;
    }

}
