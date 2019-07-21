package algorithms.arrays;

import java.util.ArrayList;

public class FlatArray {

    public static void main(String[] args) {
        Object arr3[] = {7, 8};
        Object arr2[] = {5, 6, arr3};
        Object arr1[] = {3, 4, arr2};
        Object arr[] = {1, 2, arr1};

        ArrayList<Integer> neww = new ArrayList<>();
        flatArray(arr, neww);
        neww.forEach(System.out::println);
    }

    private static void flatArray(Object[] arr, ArrayList<Integer> neww) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                neww.add((int) arr[i]);
            } else if (arr[i].getClass().isArray()) {
                flatArray((Object[]) arr[i], neww);
            }
        }
    }
}
