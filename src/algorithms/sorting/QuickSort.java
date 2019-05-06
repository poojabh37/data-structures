package algorithms.sorting;

import static algorithms.sorting.BubbleSort.printElements;
import static algorithms.sorting.BubbleSort.swap;

// Complexity : O(nlogn)
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};

        quickSort(arr, 0, arr.length - 1);
        printElements(arr);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, 0, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; //let ->right most element
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, end, pIndex);
        return pIndex;
    }
}
