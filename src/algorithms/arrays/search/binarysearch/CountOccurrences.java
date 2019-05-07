package algorithms.arrays.search.binarysearch;

import static algorithms.arrays.search.binarysearch.BinarySearch.searchOccurrence;

public class CountOccurrences {

    public static void main(String[] args) {
        int search = 3;

        int arr[] = {1, 3, 3, 3, 10, 10, 10, 10, 11};

        countOccurrencesBS(arr, search);
        countOccurrencesLS(arr, search);
    }

    //use BINARY SEARCH
    //Complexity : O(log2n)
    private static void countOccurrencesBS(int[] arr, int search) {
        int first = searchOccurrence(arr, search, true);
        int last = searchOccurrence(arr, search, false);
        int count = last - first + 1;
        System.out.println("Occurrences : " + count);
    }

    //use LINEAR SEARCH
    //Complexity : O(n)
    private static void countOccurrencesLS(int[] arr, int search) {
        int count = 0;
        for (int num : arr) {
            if (num == search) {
                count++;
            }
        }
        System.out.println("Occurrences " + count);
    }

}
