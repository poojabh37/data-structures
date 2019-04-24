package difficulty.school.strings;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

//string which has all alphabets
public class PanagramCheck {

    public static void main(String[] args) {
        String s1 = "The Quick Brown Fox jumps over the " +
                "Lazy Dog";
        String s2 = "the quick brown fox";
        checkPanagram(s1);
        checkPanagram(s2);
    }

    private static void checkPanagram(String s) {
        boolean status = true;
        boolean[] isPresent = getCharactersPresent(s);
        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) {
                status = false;
            }
        }
        System.out.println(status);
    }

    private static boolean[] getCharactersPresent(String s) {
        boolean[] charPresent = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if (isLowerCase(s.charAt(i))) {
                charPresent[s.codePointAt(i) - 'a'] = true;
            }
            if (isUpperCase(s.charAt(i))) {
                charPresent[s.codePointAt(i) - 'A'] = true;
            }
        }
        return charPresent;
    }
}
