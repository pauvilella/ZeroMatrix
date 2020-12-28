import java.util.*;

public class Main {
    int[][] m = { {1,2,3,0,4}, {1,2,3,4,5}, {1,0,2,3,4} };

    private void setToZero(int[][] m, boolean[] rows, boolean[] cols) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(rows[i] || cols[j]) {
                    m[i][j] = 0;
                }
            }
        }
    }

    int[][] zero(int[][] m) {
        boolean[] rows = new boolean[m.length];
        boolean[] cols = new boolean[m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    if (!rows[i]) {
                        rows[i] = true;
                    }

                    if (!cols[j]) {
                        cols[j] = true;
                    }
                }
            }
        }

        setToZero(m, rows, cols);

        return m;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Main program = new Main();
        printMatrix(program.m);
        int[][] result = program.zero(program.m);
        printMatrix(result);
    }
}
