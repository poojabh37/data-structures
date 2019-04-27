package algorithms.deletion;

import java.util.Scanner;

import static algorithms.insertion.ArrayInsertion.printArray;

public class ArrayDeletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();

        int item = delete(arr, size, pos);
        System.out.println("Deleted Element : " + item);
    }

    //returns element deleted
    private static int delete(int[] arr, int size, int pos) {
        int item = arr[pos];
        for (int i = pos; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size = size - 1;
        printArray(arr, size);
        return item;
    }

}
