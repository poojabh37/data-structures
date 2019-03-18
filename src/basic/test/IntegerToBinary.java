package basic.test;

import java.util.Scanner;

public class IntegerToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int decimal = sc.nextInt();
            String binary = convertToBinary(decimal);
            System.out.println(binary);
        }
    }

    private static String convertToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(String.valueOf(decimal % 2));
            decimal = decimal / 2;
        }

        binary.reverse();  //we always go from down to up
        while (binary.length() != 14) {
            binary.insert(0, "0");
        }
        return binary.toString();
    }
}
