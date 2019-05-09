package algorithms.arrays.sorting;

import static algorithms.arrays.sorting.BubbleSort.printElements;
import static algorithms.arrays.sorting.BubbleSort.swap;

//Complexity : O(n2)
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 6, 5, 3};

        selectionSort(arr, arr.length);
        printElements(arr);
    }

    private static void selectionSort(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            int minLoc = minimum(arr, i);
            swap(arr, i, minLoc);
        }
    }

    //returns index of minimum element
    private static int minimum(int[] arr, int startIndex) {
        int minLoc = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < arr[minLoc]) {
                minLoc = i;
            }
        }
        return minLoc;
    }

}
