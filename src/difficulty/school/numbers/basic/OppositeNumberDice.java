package difficulty.school.numbers.basic;

import java.util.Scanner;

public class OppositeNumberDice {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int num = sc.nextInt();
            int oppositeSide = getOppositeSideOfDice(num);
            System.out.println(oppositeSide);
        }
    }

    private static int getOppositeSideOfDice(int num) {
        return 7 - num;  //the total sum of opposite sides is 7
    }

}
