/*
Write a program that asks the user how many rows and columns he wants to store a matrix.
Enter numbers to fill the matrix. Print the matrix at the end according to rows and columns.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        System.out.println("\nEnter numbers to fill the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int number = sc.nextInt();
                mat[i][j] = number;
            }
        }

        System.out.println("\nInserted matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

    }
}