package difficulty.school.strings.basic;

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String source = input.next();
                String rev = reverseSwap(source);
                System.out.println(rev);
            }
        }
    }

    //method 1  --with auxillary array
    private static String reverse(String source) {
        char[] reverseA = new char[source.length()];
        for (int i = source.length() - 1; i >= 0; i--) {
            reverseA[source.length() - 1 - i] = source.charAt(i);
        }
        return new String(reverseA);
    }

    //method 2  --using String API
    private static String reverseString(String source) {
        return new StringBuilder(source).reverse().toString();
    }

    //method3  //swap - without auxillary array
    private static String reverseSwap(String source) {
        char[] origA = source.toCharArray();
        for (int i = 0, j = source.length() - 1; i < j; i++, j--) {
            char temp = 't';
            temp = origA[i];
            origA[i] = origA[j];
            origA[j] = temp;
        }
        return new String(origA);
    }
}
