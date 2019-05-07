package problems.school.numbers;

public class Swap2Num {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;

        swap(a, b);
        swapWithTemp(a, b);

    }

    private static void swap(int a, int b) {
        if (a != b) {
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println(a + " " + b);
        }
    }

    private static void swapWithTemp(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}

