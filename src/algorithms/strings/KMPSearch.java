package algorithms.strings;

import java.util.Scanner;

import static algorithms.arrays.sorting.BubbleSort.printElements;

public class KMPSearch {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String text = input.next();
            String pattern = input.next();
            kmpSearch(text, pattern);
        }
    }

    private static void kmpSearch(String text, String patt) {
        int M = patt.length();
        int[] lps = new int[M];

        calculateLPS(patt, M, lps);

        int i = 0;
        int j = 0;
        while (i < text.length() && j < M) {
            if (text.charAt(i) == patt.charAt(j)) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
            if (j == patt.length()) {
                System.out.print((i - j) + " ");
            }
        }

    }

    private static void calculateLPS(String patt, int size, int[] lps) {
        lps[0] = 0;
        int len = 0; //length of lps in sub pattern [0-(i-1)]
        int i = 1;
        while (i < size) {
            if (patt.charAt(i) == patt.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        printLPS(lps);
    }

    private static void printLPS(int[] lps) {
        System.out.print("LPS : [");
        printElements(lps);
        System.out.println("]");
    }

}
