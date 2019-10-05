package algorithms.arrays;

import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }

            int majority = printMajority(arr, size);
            System.out.println(majority);
        }
    }

    //moore's voting algo
    private static int printMajority(int[] arr, int size) {
        int candidate = findCandidate(arr, size);
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > size / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    private static int findCandidate(int[] arr, int size) {
        int majorityCan = arr[0];
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (arr[i] == majorityCan) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majorityCan = arr[i];
                count = 1;
            }
        }
        return majorityCan;
    }
}

