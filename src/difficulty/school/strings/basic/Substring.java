package difficulty.school.strings.basic;

import java.util.Scanner;

class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            String source = input.next();
            int start = input.nextInt();
            int end = input.nextInt();

            substring(start, end, source);
            String sb1 = source.substring(start, end + 1);
            System.out.println(sb1);
        }
    }

    private static void substring(int start, int end, String s) {
        for (int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }
}