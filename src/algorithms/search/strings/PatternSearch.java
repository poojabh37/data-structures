package algorithms.search.strings;

import java.util.Scanner;

public class PatternSearch {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String s1 = input.next();
                String s2 = input.next();
                int position = naiveSearch(s1, s2);
                System.out.println(position);
            }
        }
    }

    private static int naiveSearch(String str, String target) {
        int strl = str.length();
        int targetl = target.length();
        for (int i = 0; i <= strl - targetl; i++) {
            int j;
            for (j = 0; j < targetl; j++) {
                if (str.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (j == targetl) {
                return i;
            }
        }
        return -1;
    }
}
