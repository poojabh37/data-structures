package algorithms.arrays;

public class PrintAllSubArrays {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        //subArrays(arr);
        subSets(arr);
    }

    private static void subSets(int[] arr) {
        System.out.println("{}");
        for (int length = 1; length <= arr.length; length++) {
            for (int start = 0; start < arr.length; start++) {
                System.out.print("{" + arr[start]);
                int size = 1;
                if (arr.length - start + 1 > length) {
                    int index = start + 1;
                    for (int k = 0; k < arr.length && size < length; k++) {
                        System.out.print(", " + arr[index]);
                        size++;
                        index++;
                    }
                }
                System.out.println("}");
            }
        }
    }

    private static void subArrays(int[] arr) {
        for (int length = 1; length <= arr.length; length++) {
            for (int start = 0; start < arr.length; start++) {
                int index = start;
                if (arr.length - start + 1 > length) {
                    for (int k = 1; k <= length; k++) {
                        System.out.print(arr[index] + " ");
                        index++;
                    }
                }
                System.out.println();
            }
        }
    }
}
