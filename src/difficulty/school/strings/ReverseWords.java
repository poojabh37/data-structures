package difficulty.school.strings;

import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String source = sc.next();
            reverseWords(source);
        }
    }

    private static void reverseWords(String source) {
        String[] words = source.split("\\.");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + ".");
        }
    }
}
