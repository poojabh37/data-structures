package difficulty.school.strings.words;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import static difficulty.school.strings.words.SplitString.splitWords;

public class ReverseWords {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String source = br.readLine();
            reverseWords(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reverseWords(String source) {
        String[] words = source.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i].trim());
            if (i > 0)
                System.out.print(" ");
        }
        System.out.println();
    }

    //without java API  --- preferred
    private static void reverseWordsA(String source) {
        List<String> words = splitWords(source);
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.print(words.get(i));
            if (i > 0)
                System.out.print(" ");
        }
        System.out.println();
    }

    //method 2 --without Auxillary array
    //reverse the string....reverse the words
    private static void reverse(String s) {
        s = s.trim();
        char[] revA = s.toCharArray();
        reverseString(revA, 0, s.length() - 1);
        int wordStart = 0;
        int wordEnd;
        for (int i = 0; i < s.length(); i++) {
            if (revA[i] == ' ') {
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
