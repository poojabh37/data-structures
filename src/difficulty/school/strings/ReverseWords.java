package difficulty.school.strings;

import java.util.ArrayList;
import java.util.List;
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
        // String[] words = source.split("\\.");
        List<String> words = splitString(source);
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.print(words.get(i) + ".");
        }
    }

    private static List<String> splitString(String source) {
        List<String> words = new ArrayList<>();
        char[] letters = source.toCharArray();
        char[] word = new char[source.length()];
        int wordIndex = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != '.') {
                word[wordIndex] = letters[i];
                wordIndex++;
            } else if (letters[i] == '.') {
                words.add(new String(word));
                word = new char[source.length()];
            }
            if (i == letters.length - 1) {
                words.add(new String(word));
            }
        }
        return words;
    }
}
