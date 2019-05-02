package difficulty.school.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vowels {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                String s = br.readLine();
                System.out.println(delete(s));
                reverse(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String delete(String source) {
        //return source.replaceAll("[aeiouAEIOU]", "");

        StringBuilder neww = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (!isVowel(source.charAt(i))) {
                neww.append(source.charAt(i));
            }
        }
        return neww.toString();
    }

    private static void reverse(String source) {
        char[] string = source.toCharArray();
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (isVowel(string[i])) {
                vowels.append(string[i]);
            }
        }

        //place at correct pos
        String revVowels = vowels.reverse().toString();
        int index = 0;
        for (int i = 0; i < source.length(); i++) {
            if (isVowel(string[i])) {
                string[i] = revVowels.charAt(index);
                index++;
            }
        }

        System.out.println(new String(string));
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
