package algorithms.arrays.search.binarysearch;

import static algorithms.arrays.search.binarysearch.BinarySearch.getMid;
import static algorithms.arrays.search.binarysearch.BinarySearch.printStatus;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int search = -23;

        int arr[] = {1, 5, 23, 89, 111, 123, 156, 1380};

        int end = arr.length - 1;
        int index = search(arr, 0, end, search);
        printStatus(index);
    }

    private static int search(int[] arr, int start, int end, int item) {
        if (start <= end) {
            int mid = getMid(start, end);

            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                end = mid - 1;
                return search(arr, start, end, item);
            } else {
                start = mid + 1;
                return search(arr, start, end, item);
            }
        }
        return -1;
    }
}
