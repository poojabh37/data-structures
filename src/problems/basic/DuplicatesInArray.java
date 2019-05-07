package problems.basic;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    //print duplicates in array

    public static void main(String[] args) {

        int arr[] = {10, 20, 10, 20, 30, 40, 30};
        findDuplicates(arr);

    }

    private static void findDuplicates(int[] arr) {
        Map<Integer, Integer> numVsOccurences = getNumVsOccurences(arr);
        numVsOccurences.forEach((num, count) -> {
            if (count > 1) {
                System.out.print(num + " ");
            }
        });
    }

    private static Map<Integer, Integer> getNumVsOccurences(int[] arr) {
        Map<Integer, Integer> numVsOccurences = new HashMap<>();
        //refactoring
        for (int num : arr) {
            numVsOccurences.putIfAbsent(num, 0);
            Integer occur = numVsOccurences.get(num) + 1;
            numVsOccurences.put(num, occur);
        }

//        for (int num : arr) {
//            if (numVsOccurences.get(num) == null) {
//                numVsOccurences.put(num, 1);
//            } else {
//                Integer occur = numVsOccurences.get(num) + 1;
//                numVsOccurences.put(num, occur);
//            }
//        }
        return numVsOccurences;
    }
}

