package problems.school;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();

        long value = powerOf(num, power);
        System.out.println(value);
    }

    //complexity : O(n)
    private static long powerOfBasic(int num, int power) {
        int value = 1;
        for (int i = 0; i < power; i++) {
            value = value * num;
        }
        return value;
    }

    //complexity : O(n/2)
    private static long powerOf(int num, int power) {
        if (num == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return num;
        }
        int midPow = power / 2;
        int remPow = power % 2;

        int value = 1;
        for (int i = 0; i < midPow; i++) {
            value = value * num;
        }

        value = value * value;
        if (remPow != 0) {
            value = value * num;
        }
        return value;
    }
}
