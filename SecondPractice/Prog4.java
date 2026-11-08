package SecondPractice;

import java.util.Random;

public class Prog4 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(8);
        System.out.println("Исходная матрица:");
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Перевернутая матрица:");
        printMatrix(matrix);
    }

    public static int[][] createMatrix(int n) {
        Random random = new Random();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(1, 11);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%-3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int left = 0, right = matrix.length - 1; left < matrix.length / 2; left++, right--) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
        }
    }
}
