package difficulty.school.strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {
        String source = "pooja.bhatia.is.happy";
        reverseWords(source);
    }

    private static void reverseWords(String source) {
        String[] words = source.split("\\.");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0)
                System.out.print(".");
        }
        System.out.println();
    }

    //method 3 --without Auxillary array
    private static void reverse(String s) {
        char[] revA = s.toCharArray();
        reverseString(revA, 0, s.length() - 1);
        int wordStart = 0;
        int wordEnd;
        for (int i = 0; i < s.length(); i++) {
            if (revA[i] == '.') {
                wordEnd = i - 1;
                reverseString(revA, wordStart, wordEnd);
                wordStart = i + 1;
            } else if (i == s.length() - 1) {
                reverseString(revA, wordStart, s.length() - 1);
            }
        }
        System.out.println(new String(revA));
    }

    private static void reverseString(char[] revA, int wordStart, int wordEnd) {
        for (int k = wordStart; k < wordEnd; k++, wordEnd--) {
            char temp;
            temp = revA[k];
            revA[k] = revA[wordEnd];
            revA[wordEnd] = temp;
        }
    }

    //do not use this
    //method 3  -- using auxillary array
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
