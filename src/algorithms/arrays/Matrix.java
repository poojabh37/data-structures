package algorithms.arrays;

public class Matrix {

    public static void main(String[] args) {
        int a[][] = {{1, 0, 1}, {2, 1, 1}, {4, 2, 3}};
        int b[][] = {{1, 1, 2}, {0, 0, 1}, {4, 1, 5}};
        int c[][] = new int[3][3];
        multiply(a, b, c);
    }

    private static void multiply(int[][] a, int[][] b, int[][] c) {
        int i = 0;
        int j = 0;
        while (i < 3 && j < 3) {
            c[i][j] = (a[i][j] * b[j][i]) + (a[i][j] * b[j][i]) +
                    (a[i][j] * b[j][i]);
            j++;
        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
