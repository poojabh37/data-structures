package difficulty.school.numbers;

import java.util.LinkedHashMap;
import java.util.Map;

//toDo remove duplicates values in array
public class DuplicateInArray {

    public static void main(String[] args) {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println("Original Length : " + ar.length);
        printDuplicates(ar);
    }

    private static void printDuplicates(int[] ar) {
        System.out.println("Duplicates : ");
        Map<Integer, Integer> numVsCount = getNumVsOccurences(ar);
        numVsCount.forEach((key, value) -> {
            if (value > 1) {
                System.out.print(key + " ");
            }
        });
        System.out.println();
    }

    private static Map<Integer, Integer> getNumVsOccurences(int[] ar) {
        Map<Integer, Integer> numVsCount = new LinkedHashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (!numVsCount.containsKey(ar[i])) {
                numVsCount.put(ar[i], 1);
            } else {
                int occurences = numVsCount.get(ar[i]) + 1;
                numVsCount.put(ar[i], occurences);
            }
        }
        return numVsCount;
    }

}
