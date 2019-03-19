package difficulty.school.strings;

import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String source = input.next();
                String rev = reverseString(source);

                if (source.equals(rev)) {
                    System.out.println("YES");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    private static String reverseString(String source) {
        return new StringBuilder(source).reverse().toString();
    }
}
