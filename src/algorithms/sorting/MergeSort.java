package algorithms.sorting;

import static algorithms.sorting.BubbleSort.printElements;

//Complexity : O(NlogN)
public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 6, 8, 5, 4, 1};

        mergeSort(arr, arr.length);
        printElements(arr);
    }

    //divide and conquer
    private static void mergeSort(int[] arr, int length) {
        if (length > 1) {
            int mid = length / 2;
            int[] left = new int[mid];
            int[] right = new int[length - mid];
            //copy left half
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            //copy right half
            for (int i = mid; i < length; i++) {
                right[i - mid] = arr[i];
            }

            //sort left and right array by dividing further
            mergeSort(left, left.length);
            mergeSort(right, right.length);
            merge(left, right, arr);
        }
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        //copy remaining from left array if available
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        //copy remaining from right array if available
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}

