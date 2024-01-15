/*
Write a program that creates a 4x4 matrix and asks the user to enter numbers.
Find the largest and smallest element in the matrix.
Print the values and in which row and column the respective values are found.
In this program, if there are duplicate numbers in the matrix, the row and column in which the number appeared first will be pointed out.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];

        System.out.println("Enter matrix numbers:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = sc.nextInt();
                mat[i][j] = number;
            }
        }

        int largest = mat[0][0], rowLargest = 0, columnLargest = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (mat[i][j] > largest) {
                    largest = mat[i][j];
                    rowLargest = i;
                    columnLargest = j;
                }
            }
        }

        int smallest = mat[0][0], rowSmallest = 0, columnSmallest = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (mat[i][j] < smallest) {
                    smallest = mat[i][j];
                    rowSmallest = i;
                    columnSmallest = j;
                }
            }
        }

        System.out.println("\nThe largest value in the matrix is " + largest + " and is found in"
                           + " row " + rowLargest + " column " + columnLargest);
        System.out.println("\nThe smallest value in the matrix is " + smallest + " and is found in"
                + " row " + rowSmallest + " column " + columnSmallest);

    }
}