package problems.school.strings.basic;

import java.util.Scanner;

class Lowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            String source = input.next();
            System.out.println(source.toLowerCase());
        }
    }
}