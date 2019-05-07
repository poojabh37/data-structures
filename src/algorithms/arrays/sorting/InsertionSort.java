package algorithms.arrays.sorting;

import static algorithms.arrays.sorting.BubbleSort.printElements;

//Complexity : O(n2)
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 5, 3};

        insertionSort(arr, arr.length);
        printElements(arr);
    }

    private static void insertionSort(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];  //move elements forward
                j--;
            }
            arr[j + 1] = value;  //insert
        }
    }
}
