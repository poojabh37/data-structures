package difficulty.school.patterns;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  int testCases = sc.nextInt();
        //   for(int i = 0; i < testCases; i++){
        int lines = 15;
        printPattern(lines);
        // }
    }

    private static void printPattern(int lines) {
        int print = 15;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(print + " ");
                print++;
            }
            System.out.println();
        }

    }
}
