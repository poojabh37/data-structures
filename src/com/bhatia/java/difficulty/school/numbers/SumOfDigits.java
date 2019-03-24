package difficulty.school.numbers;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            int sum1 = sumOfDigits(num);
            System.out.println(sum1);
            int sum = sumOfDigits1(num + "");
            System.out.println(sum);
        }
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    private static int sumOfDigits1(String num) {
        int sum = 0;
        char[] arr = num.toCharArray();
        for (char c : arr) {
            String digit = c + "";
            sum += Integer.parseInt(digit);
        }
        return sum;
    }
}
