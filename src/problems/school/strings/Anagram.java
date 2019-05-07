package problems.school.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

            char[] charS1 = s1.toCharArray();
            char[] charS2 = s2.toCharArray();

            Arrays.sort(charS1);  //use quickSort
            Arrays.sort(charS2);

            if (new String(charS1).equalsIgnoreCase(new String(charS2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
