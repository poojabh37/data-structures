package difficulty.school.strings;

import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String source = input.next();
                isPallindrome(source);
            }
        }
    }

    private static void isPallindrome(String source) {
       /* source = source.toLowerCase();                       //check regardless of case and special char including spaces
        Pattern regex = Pattern.compile("[^A-Za-z]");
        source = source.replaceAll(regex.pattern(), "");
        */
        if (source.equals(reverse(source))) {
            System.out.println("YES");
        }
        System.out.println("No");
    }

    private static String reverseString(String source) {
        return new StringBuilder(source).reverse().toString();
    }

    private static String reverse(String source) {
        char[] origA = source.toCharArray();
        char[] reverseA = new char[source.length()];
        for (int i = source.length() - 1; i >= 0; i--) {
            reverseA[source.length() - 1 - i] = origA[i];
        }
        return new String(reverseA);
    }


}
