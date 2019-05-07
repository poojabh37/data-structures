package problems.school.strings.words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SplitString {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String source = br.readLine();
            for (String word : splitWords(source)) {
                System.out.println(word);
            }
            capitalizeFirstLetterOfWord(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<String> splitWords(String a) {
        if (a.length() == 0) {
            throw new RuntimeException("EMPTY STRING");
        }
        boolean isPrevSpace = false;
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!(ch == ' ')) {
                isPrevSpace = false;
                word.append(a.charAt(i));
            }
            if (ch == ' ') {
                if (i == 0) {
                    isPrevSpace = true;
                }
                if (i > 0 && !isPrevSpace) {
                    isPrevSpace = true;
                    words.add(word.toString());
                    word = new StringBuilder();
                }
            }
        }
        words.add(word.toString());
        return words;
    }

    private static void capitalizeFirstLetterOfWord(String source) {
        List<String> words = splitWords(source);
        for (String word : words) {
            char[] wordA = word.toCharArray();
            wordA[0] = Character.toUpperCase(wordA[0]);
            System.out.print(new String(wordA) + " ");
        }
    }
}
