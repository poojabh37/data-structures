package difficulty.school.numbers.basic;

import java.util.Scanner;

public class NumOfDiagnolsPolygon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int sides = sc.nextInt();
            int diagnols = getNumOfDiagonals(sides);
            System.out.println(diagnols);
        }
    }

    private static int getNumOfDiagonals(int sides) {
        return sides * (sides - 3) / 2;
    }
}