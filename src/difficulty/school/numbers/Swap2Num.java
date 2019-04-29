package difficulty.school.numbers;

public class Swap2Num {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;

        swap(a, b);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("          Swapped " + a + " " + b);
    }
}
