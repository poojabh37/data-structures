package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {91, 72, 65, 83, 12, 15, 10};

        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, 0, pivotIndex - 1);
            quickSort(arr, pivotIndex, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivotIndex = end; //let it be the right most element

        for (int i = start; i < end; i++) {
            if (arr[i] > arr[pivotIndex]) {
                arr[i] = arr[i] + arr[pivotIndex];
                arr[pivotIndex] = arr[i] - arr[pivotIndex];
                arr[i] = arr[i] - arr[pivotIndex];
            }
        }
        return pivotIndex;
    }
}
