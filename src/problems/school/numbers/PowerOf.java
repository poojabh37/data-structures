package problems.school.numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();

        String value = new PowerOf().powerOfLarge(num, power);
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

    /*Example
    pow(2,9)
    = pow(2,4) * pow(2*4) * 2;
    = pow(2*2, 4) * 2
    */
    //complexity : O(n/2)
    private String powerOfLarge(int num, int power) {
        if (num == 0) {
            return "0";
        }
        if (power == 0) {
            return "1";
        }
        if (power == 1) {
            return Integer.toString(num);
        }
        int midPow = power / 2;
        int remPow = power % 2;

        int nums = num * num;
        BigInteger numm = new BigInteger(Integer.toString(nums));
        BigInteger value = new BigInteger("1");
        for (int i = 0; i < midPow; i++) {
            value = value.multiply(numm);
        }

        if (remPow != 0) {
            value = value.multiply(numm);
        }
        return value.toString();
    }
}
