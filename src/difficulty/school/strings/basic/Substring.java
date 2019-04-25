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

            String sb1 = substring(start, end, source);
            System.out.println(sb1);
            System.out.println(source.substring(start, end + 1));
        }
    }

    private static String substring(int start, int end, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}