package algorithms.search.arrays.binarysearch;

// works only for sorted arrays
// Complexity : O(log2n)
public class BinarySearch {

    public static void main(String[] args) {
        int search = 10;

        int arr[] = {1, 3, 10, 10, 10, 10, 11};

        int index = search(arr, search);
        printStatus(index);

        index = searchOccurrence(arr, search, true);
        printStatus(index);

        index = searchOccurrence(arr, search, false);
        printStatus(index);
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

    /*
    if 
    searchFirst == true
    returns : first occurrence of element

    else
    returns : last occurrence of element
     */
    static int searchOccurrence(int[] arr, int search, boolean searchFirst) {
        int loc = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = getMid(start, end);
        while (start <= end) {
            if (search == arr[mid]) {
                loc = mid;
                if (searchFirst) {
                    end = mid - 1;   // search more in Ist half
                } else {
                    start = mid + 1;   // search more in IInd half
                }
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

    public static void printStatus(int index) {
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element NOT found");
        }
    }


}
