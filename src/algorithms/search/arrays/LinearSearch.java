package algorithms.search.arrays;

import static algorithms.search.arrays.binarysearch.BinarySearch.printStatus;

public class LinearSearch {

    public static void main(String[] args) {
        int search = -23;

        int arr[] = {12, 5, 89, 45, 23, 56, 38};

        int index = search(arr, search);
        printStatus(index);
    }

    private static int search(int[] arr, int search) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
            }
        }
        return index;
    }
}
