import java.util.Scanner;

public class DiagonalArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Check for square matrix
        if (rows != cols) {
            System.out.println("Note: Diagonal operations are only defined for square matrices.");
            return;
        }

        int[][] array = new int[rows][cols];

        // Input elements
        System.out.println("\nEnter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        // Display full matrix
        System.out.println("\nMatrix:");
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        // Diagonal elements
        System.out.println("\nDiagonal elements:");
        for (int i = 0; i < rows; i++) {
            System.out.print(array[i][i] + " ");
        }

        // Elements above the diagonal
        System.out.println("\n\nElements above the main diagonal:");
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        // Elements below the diagonal
        System.out.println("\n\nElements below the main diagonal:");
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        sc.close();
    }
}
