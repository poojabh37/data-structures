package algorithms.arrays.sorting;

//Complexity : O(n2)
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {32, 51, 27, 85, 66, 23, 13, 57};
        bubbleSort(arr, arr.length);
    }

    private static void bubbleSort(int[] arr, int size) {
        for (int pass = 0; pass < size - 1; pass++) {
            int steps = size - 1 - pass;
            for (int j = 0; j < steps; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        printElements(arr);
    }

    static void swap(int[] arr, int a, int b) {
        if (a != b) {
            arr[a] = arr[a] + arr[b];
            arr[b] = arr[a] - arr[b];
            arr[a] = arr[a] - arr[b];
        }
    }

    public static void printElements(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
