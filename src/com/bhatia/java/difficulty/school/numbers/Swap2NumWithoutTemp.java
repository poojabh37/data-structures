package difficulty.school.numbers;

public class Swap2NumWithoutTemp {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;

        swap(a, b);
    }

    private static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
