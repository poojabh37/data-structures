package problems.school.patterns;

public class RightTriangle {

    public static void main(String[] args) {
        int lines = 15;
        printPattern(lines);
    }

    private static void printPattern(int lines) {
        int print = 15;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(print + " ");
                print++;
            }
            System.out.println();
        }

    }
}
