package difficulty.school.strings;

public class Words {

    public static void main(String[] args) {
        String source = "pooja.bhatia.is.happy";
        reverse(source);
        lengthOfLastWord(source);
        capitalizeFirstLetterOfWord(source);
    }

    private static void capitalizeFirstLetterOfWord(String source) {
        source = source.trim();
        String[] words = source.split("\\.");
        for (String word : words) {
            char[] wordA = word.toCharArray();
            wordA[0] = Character.toUpperCase(wordA[0]);
            System.out.print(new String(wordA) + " ");
        }
    }

    private static void lengthOfLastWord(final String source) {
        String neww = source.trim();  //for trailing spaces at the last & start of string
        String[] words = neww.split("\\.");
        int length = words[words.length - 1].length();
        System.out.println(length);
    }

    private static void reverseWords(String source) {
        source = source.trim();
        String[] words = source.split("\\.");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + ".");
        }
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
