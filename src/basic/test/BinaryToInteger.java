package basic.test;

import java.util.Scanner;

public class BinaryToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String binary = sc.next();
            int decimal = convertToDecimal(binary);
            System.out.println(decimal);
        }
    }

    private static int convertToDecimal(String binary) {
        char[] binaryArr = binary.toCharArray();
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binaryArr[i] == '1') {
                decimal += Math.pow(2, (binary.length() - 1 - i));
            }
        }
        return decimal;
    }
}
