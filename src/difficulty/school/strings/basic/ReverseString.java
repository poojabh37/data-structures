package difficulty.school.strings.basic;

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String source = input.next();
                String rev = reverseString(source);
                System.out.println(rev);
            }
        }
    }

    private static String reverseString(String source) {
        return new StringBuilder(source).reverse().toString();
    }
}
