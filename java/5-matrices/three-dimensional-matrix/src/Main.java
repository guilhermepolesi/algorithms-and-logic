/*
Write a program that creates a three-dimensional matrix. Ask the user to enter row, column, and layer values.
Enter numbers to fill the matrix.
Ask the user which number he wants to find the position in the matrix.
Print the row, column and layer where the number is located.
In this program, if there are duplicate numbers in the matrix, the row, column and layer in which the number appeared first will be pointed out.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row, column, layer;
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        column = sc.nextInt();
        System.out.print("Enter the number of layers: ");
        layer = sc.nextInt();

        int[][][] mat = new int[row][column][layer];
        System.out.println("\nInsert the numbers into the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < layer; k++) {
                    int number = sc.nextInt();
                    mat[i][j][k] = number;
                }
            }
        }

        int number, rowNumber = 0, columnNumber = 0, layerNumber = 0;
        boolean numberFound = false;
        System.out.print("\nEnter the number to find the position in the matrix: ");
        number = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < layer; k++) {
                    if (number == mat[i][j][k]) {
                        rowNumber = i;
                        columnNumber = j;
                        layerNumber = k;
                        numberFound = true;
                        break;
                    }
                }
                if (numberFound) {
                    break;
                }
            }
            if (numberFound) {
                break;
            }
        }

        if (numberFound) {
            System.out.println("\nThe number " + number + " is found in row " + rowNumber
                               + " column " + columnNumber + " layer " + layerNumber);
        }
        else {
            System.out.println("\nThe number was not inserted into the matrix");
        }

    }
}