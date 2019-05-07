package problems.school.numbers;

import java.util.Scanner;

//sum of cubes of digits should be equal to the number
//itself
public class ArmstrongNumbers {

    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            int sum = sumOfCubesOfDigits(num);
            if (num == sum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static int sumOfCubesOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, 3);
            num = num / 10;
        }
        return sum;
    }

}
