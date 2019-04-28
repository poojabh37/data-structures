package algorithms.search.arrays.binarysearch;

// works only for sorted arrays
// Complexity : O(log2n)
public class BinarySearch {

    public static void main(String[] args) {
        int search = 10;

        int arr[] = {1, 10, 10, 10, 11, 12};

        int index = search(arr, search);
        printStatus(index);

        index = firstOccurence(arr, search);
        printStatus(index);

        index = lastOccurence(arr, search);
        printStatus(index);

        countOccurences(arr, search);
    }

    private static void countOccurences(int[] arr, int search) {
        int count = 0;
        int start = 0;
        int end = arr.length - 1;
        int mid = getMid(start, end);
        while (start <= end) {
            if (search == arr[mid]) {
                count++;   //element found
                end = mid - 1;  // search more in II half
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = getMid(start, end);
        }
        System.out.println(count);
    }

    private static int search(int arr[], int search) {
        int start = 0;
        int end = arr.length - 1;
        int mid = getMid(start, end);
        while (start <= end) {
            if (arr[mid] < search) {
                start = mid + 1;       // IInd half
            } else if (arr[mid] > search) {
                end = mid - 1;        // Ist half
            } else {
                return mid;
            }
            mid = getMid(start, end);
        }
        return -1;
    }

    private static int firstOccurence(int arr[], int search) {
        int loc = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = getMid(start, end);
        while (start <= end) {
            if (search == arr[mid]) {
                loc = mid;
                end = mid - 1;  // search more in II half
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = getMid(start, end);
        }
        return loc;
    }

    private static int lastOccurence(int[] arr, int search) {
        int loc = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = getMid(start, end);
        while (start <= end) {
            if (search == arr[mid]) {
                loc = mid;
                start = mid + 1;  // search more in II half
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = getMid(start, end);
        }
        return loc;
    }

    static int getMid(int start, int end) {
        return (start + end) / 2;
    }

    static void printStatus(int index) {
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element NOT found");
        }
    }


}
