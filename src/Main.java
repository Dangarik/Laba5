
public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = new int[0][0];

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        printResults(matrix1);
        printResults(matrix2);
        printResults(matrix3);
    }
    public static void printResults(int[][] matrix) {
        try {
            clearNE(matrix);
            System.out.println("Очищена матриця :");
            printMatrix(matrix);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
    public static void clearNE(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("Матриця не може бути null.");
        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Матриця не може бути порожньою.");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != cols) {
                throw new IllegalArgumentException("Усі рядки повинні мати однакову кількість стовпців.");
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i <= j) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

