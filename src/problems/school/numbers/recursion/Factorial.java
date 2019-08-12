package problems.school.numbers.recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            int fact = factorial(num);
            System.out.println(fact);
        }
    }

    private static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }

}
