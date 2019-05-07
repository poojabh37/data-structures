package algorithms.strings;

import java.util.Scanner;

public class StartEndSamePattern {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                int length = input.nextInt();
                String binary = input.next();
                start1End1(binary, length);
            }
        }
    }

    private static void start1End1(String binary, int length) {
//        int substrings = 0;
//        for (int i = 0; i < length; i++) {
//            if (binary.charAt(i) == '1') {
//                for (int j = i + 1; j < length; j++) {
//                    if (binary.charAt(j) == '1') {
//                        substrings++;
//                    }
//                }
//            }
//        }
//        System.out.println(substrings);

        int c = 0;   //c is the character reqd
        for (int i = 0; i < length; ++i) {
            if (binary.charAt(i) == '1')
                ++c;
        }
        System.out.println((c * (c - 1)) / 2);
    }
}

