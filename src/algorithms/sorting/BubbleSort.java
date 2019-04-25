package algorithms.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {1, 5, 23, 89, 111, 123, 156, 1380};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        printElements(arr);
    }

    private static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
