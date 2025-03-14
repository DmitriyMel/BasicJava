package ua.org.nmu.dmelnikov.lab_2;

import java.util.Scanner;

public class Main {
    private static final int RANDOM_MATRIX_CREATION = 1;
    private static final int MANUAL_MATRIX_CREATION = 2;
    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM_ELEMENT_OF_ARRAY = 0;
    private static final int MAX_RANDOM_ELEMENT_OF_ARRAY = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[MAX_SIZE][MAX_SIZE];

        System.out.println("Enter the number of rows of the array (max size - " + MAX_SIZE + "): ");
        int rows = getValidRowsColumns(scanner);

        System.out.println("Enter the number of columns of the array(max size - " + MAX_SIZE + "): ");
        int columns = getValidRowsColumns(scanner);

        System.out.print("Choose the method of creating an array: "
                + RANDOM_MATRIX_CREATION + " - randomly, "
                + MANUAL_MATRIX_CREATION + " - manually: ");

        int method = scanner.nextInt();
        switch (method) {
            case RANDOM_MATRIX_CREATION:
                matrix = createRandomMatrix(rows, columns);
                break;
            case MANUAL_MATRIX_CREATION:
                matrix = createMatrixManually(rows, columns, scanner);
                break;
            default:
                System.out.println("Invalid input! Choose between methods " + RANDOM_MATRIX_CREATION +
                        " and " + MANUAL_MATRIX_CREATION + "!");
                scanner.next();
        }

        System.out.println("Created matrix");
        printMatrix(matrix);

        int maxOfMatrix = findMax(matrix);
        int minOfMatrix = findMin(matrix);
        double averageOfMatrix = findAverage(matrix);
        double geometricMeanOfMatrix = findGeometricMean(matrix);

        System.out.println("Max element of matrix: " + maxOfMatrix);
        System.out.println("Min element of matrix: " + minOfMatrix);
        System.out.println("The average of matrix: " + averageOfMatrix);
        System.out.println("The geometric mean of matrix: " + geometricMeanOfMatrix);

        scanner.close();
    }


    public static int getValidRowsColumns(Scanner scanner) {
        int size;
        while (true) {
            size = scanner.nextInt();
            if (size >= MIN_RANDOM_ELEMENT_OF_ARRAY && size <= MAX_RANDOM_ELEMENT_OF_ARRAY) {
                return size;
            } else {
                System.out.println("Invalid row/column number! Minimum - " + MIN_RANDOM_ELEMENT_OF_ARRAY +
                        ", maximum - " + MAX_RANDOM_ELEMENT_OF_ARRAY);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Generate a random number in the range [MIN_RANDOM, MAX_RANDOM]
                // Math.random() generates a value in the range [0, 1)
                // Multiplying by (MAX_RANDOM - MIN_RANDOM + 1) scales it to [0, range_size]
                // Adding MIN_RANDOM shifts it into the correct range
                matrix[i][j] = (int) (Math.random() *
                        (MAX_RANDOM_ELEMENT_OF_ARRAY - MIN_RANDOM_ELEMENT_OF_ARRAY + 1)
                        + MIN_RANDOM_ELEMENT_OF_ARRAY);
            }
        }
        return matrix;
    }

    public static int[][] createMatrixManually(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the array (" + rows * columns + " elements): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element [" + i + "]" + "[" + j + "]" + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static double findAverage(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return sum / count;
    }

    public static double findGeometricMean(int[][] matrix) {
        double productOfElements = 1;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                productOfElements *= matrix[i][j];
                count++;
            }
        }
        // Calculate the geometric mean by taking the N-th root of the productOfElements where N is
        // the total number of elements in the matrix
        return Math.pow(productOfElements, 1.0 / count);
    }
}