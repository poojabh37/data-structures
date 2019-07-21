package algorithms.linked_lists;

import java.util.Scanner;

public class MergeSortList extends LinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            int div = sc.nextInt();
            int rem = Math.abs(num % div);
            if (num > div) {
                if ((num - rem) % div == 0) {
                    System.out.println(num - rem);
                } else {
                    System.out.println(num + rem);
                }
            } else {
                System.out.println(div);
            }
        }
    }

}