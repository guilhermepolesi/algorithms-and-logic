/*
Write a program that asks the user how big square matrix A and square matrix B are.
Enter the numbers in the rows and columns.
Make the sum of the respective rows and columns of matrices A and B, and store in a matrix C.
Print the values of matrix C.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrices: ");
        int n = sc.nextInt();

        int[][] matA = new int[n][n];
        int[][] matB = new int[n][n];
        int[][] matC = new int[n][n];

        System.out.println("\nInsert the values into matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = sc.nextInt();
                matA[i][j] = number;
            }
        }

        System.out.println("\nInsert the values into matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = sc.nextInt();
                matB[i][j] = number;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println("\nSum matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }

    }
}