package difficulty.school.strings.words;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LenOfLastWord {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String source = br.readLine();
            lengthOfLastWord(source);
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
}
