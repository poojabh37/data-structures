package difficulty.school.strings;

import java.util.Scanner;

public class DeleteVowels {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String source = input.nextLine();
        String neww = deleteVowels(source);
        System.out.println(neww);

    }

    private static String deleteVowels(String source) {
        return source.replaceAll("[aeiouAEIOU]", "");
    }


    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
