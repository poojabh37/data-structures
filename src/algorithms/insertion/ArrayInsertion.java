package algorithms.insertion;

import java.util.Scanner;

public class ArrayInsertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int data = sc.nextInt();

        insert(arr, size, pos, data);
    }

    private static void insert(int[] arr, int size, int pos, int data) {
        for (int i = size; i >= pos; i--) {
            arr[i + 1] = arr[i];  //move elements downward
        }
        arr[pos] = data;
        size = size + 1;

        printArray(arr, size);
    }

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
