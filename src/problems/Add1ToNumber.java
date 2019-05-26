package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add1ToNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            List<Integer> A = new ArrayList<>(n);
            for (int k = 0; k < n; k++) {
                A.add(sc.nextInt());
            }

            printSum(A);
            for (int d : A) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }

    private static void printSum(List<Integer> A) {
        int size = A.size();

        if (A.get(size - 1) == 9) {
            int carry = 1;
            int i = size - 1;
            while (i >= 0 && carry == 1) {
                if (A.get(i) == 9) {
                    A.set(i, 0);
                    carry = 1;
                } else {
                    A.set(i, A.get(i) + carry);
                    carry = 0;
                }
                i--;
            }

            if (carry == 1) {
                A.add(0, 1);
            }
        } else {
            A.set(size - 1, A.get(size - 1) + 1);
        }

        //remove trailing zeros
        while (A.get(0) == 0) {
            A.remove(0);
        }
    }
}
