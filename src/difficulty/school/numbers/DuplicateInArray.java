package difficulty.school.numbers;

import java.util.HashMap;
import java.util.Map;

//print duplicates values in array
public class DuplicateInArray {

    public static void main(String[] args) {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        printDuplicates(ar);

    }

    private static void printDuplicates(int[] ar) {
        Map<Integer, Integer> numberVsOccurrences = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (!numberVsOccurrences.containsKey(ar[i])) {
                numberVsOccurrences.put(ar[i], 1);
            } else {
                int occurences = numberVsOccurrences.get(ar[i]) + 1;
                numberVsOccurrences.put(ar[i], occurences);
            }
        }

        numberVsOccurrences.forEach((key, value) -> {
            if (value > 1) {
                System.out.print(key + " ");
            }
        });

    }

}
