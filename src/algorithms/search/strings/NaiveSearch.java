package algorithms.search.strings;

import java.util.Scanner;

//preprocessing time : none
//total time : O(m*n) --m = len of pattern
public class NaiveSearch {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String text = input.next();
                String pattern = input.next();
                naiveSearch(text, pattern);
            }
        }
    }

    private static void naiveSearch(String text, String pattern) {
        //save in list for match not found
        int tLen = text.length();
        int pLen = pattern.length();
        for (int i = 0; i <= tLen - pLen; i++) {
            int j;
            for (j = 0; j < pLen; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pLen) {
                System.out.println(i);
            }
        }
    }
}
