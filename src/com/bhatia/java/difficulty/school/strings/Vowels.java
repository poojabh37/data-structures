package difficulty.school.strings;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String source = input.nextLine();
        String neww = delete(source);
        reverse(source);
        System.out.println(neww);

    }

    private static String delete(String source) {
        return source.replaceAll("[aeiouAEIOU]", "");
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
