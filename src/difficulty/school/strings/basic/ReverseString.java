package difficulty.school.strings.basic;

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String source = input.next();
                String rev = reverse(source);
                System.out.println(rev);
            }
        }
    }

    private static String reverse(String source) {
        char[] origA = source.toCharArray();
        char[] reverseA = new char[source.length()];
        for (int i = source.length() - 1; i >= 0; i--) {
            reverseA[source.length() - 1 - i] = origA[i];
        }
        return new String(reverseA);
    }

    private static String reverseString(String source) {
        return new StringBuilder(source).reverse().toString();
    }
}
