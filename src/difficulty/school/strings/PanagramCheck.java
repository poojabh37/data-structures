package difficulty.school.strings;

public class PanagramCheck {

    public static void main(String[] args) {
        String s1 = "the quick brown fox jumps over the " +
                "lazy dog";
        String s2 = "the quick brown fox";
        checkPanagram(s1);
        checkPanagram(s2);
    }

    private static void checkPanagram(String s) {
        boolean[] isPresent = getCharactersPresent(s);
        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) {
                System.out.println("NOT PANAGRAM");
                return;
            }
        }
        System.out.println("Panagram");
    }

    private static boolean[] getCharactersPresent(String s) {
        boolean[] charPresent = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.codePointAt(i)) {
                charPresent[s.codePointAt(i) - 'a'] = true;
            }
        }
        return charPresent;
    }
}
