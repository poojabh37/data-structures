package problems.basic;

import java.util.Scanner;

public class RemoveCharPresentIn2nd {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                String s1 = input.next();
                String s2 = input.next();
                String neww = removeChar(s1, s2);
                System.out.println(neww);
            }
        }
    }

    private static String removeChar(String s1, String s2) {
        StringBuilder s1c = new StringBuilder(s1);
        int i = 0;
        while (i < s1c.toString().length()) {
            boolean isMatchFound = false;
            char ch = s1c.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                char ch2 = s2.charAt(j);
                if (ch == ch2) {
                    s1c.deleteCharAt(i);
                    isMatchFound = true;
                    break;
                }
            }
            if (!isMatchFound) {
                i++;
            }
        }
        return s1c.toString();
    }
}
