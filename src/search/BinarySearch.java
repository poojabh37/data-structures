package search;

public class BinarySearch {

    public static void main(String[] args) {
        int search = -23;

        int arr[] = {1, 5, 23, 89, 111, 123, 156, 1380};

        int index = search(arr, search);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element NOT found");
        }
    }

    private static int search(int arr[], int search) {
        int start = 0;
        int end = arr.length - 1;
        int mid = getMid(start, end);
        while (start <= end) {
            if (arr[mid] < search) {
                end = mid - 1;
            } else if (arr[mid] > search) {
                start = mid + 1;
            } else {
                return mid;
            }
            mid = getMid(start, end);
        }
        return -1;
    }

    private static int getMid(int start, int end) {
        return (start + end) / 2;
    }

}
