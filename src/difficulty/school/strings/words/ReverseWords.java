package difficulty.school.strings.words;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseWords {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String source = br.readLine();
            reverseWords(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void lengthOfLastWord(final String source) {
        int i = source.length() - 1;
        while (i >= 0 && source.charAt(i) == ' ') {
            i--;
        }
        int length = 0;
        for (int j = i; j >= 0; j--) {
            char ch = source.charAt(j);
            if (!(ch == ' ')) {
                length++;
            }
            if (ch == ' ') {
                break;
            }
        }
        System.out.println(length);
    }

    private static void reverseWords(String source) {
        source = source.trim();
        String[] words = source.split("\\.");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0)
                System.out.print(".");
        }
        System.out.println();
    }

    //method 2 --without Auxillary array
    private static void reverse(String s) {
        s = s.trim();
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
}
