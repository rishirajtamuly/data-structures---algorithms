/*
Write a program to Find Transpose of a Matrix.

What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

Matrix
a11 a12 a13
a21 a22 a23

Transposed Matrix
a11 a21
a12 a22
a13 a23

 */

import java.util.*;

public class TransposeOfMatrix {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println();
        System.out.println("After Transpose Matrix : ");
        printMatrix(transpose);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter " + rows * cols + " elements in matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Original Matrix : ");
        printMatrix(matrix);
        transposeMatrix(matrix);
        
    }
}
