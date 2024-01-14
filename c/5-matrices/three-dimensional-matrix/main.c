/*
Write a program that creates a three-dimensional matrix. Ask the user to enter row, column, and layer values.
Enter numbers to fill the matrix.
Ask the user which number he wants to find the position in the matrix.
Print the row, column and layer where the number is located.
In this program, if there are duplicate numbers in the matrix, the row, column and layer in which the number appeared first will be pointed out.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int i, j, k, row, column, layer, number, rowNumber, columnNumber, layerNumber, numberFound;

    printf("Enter the number of rows: ");
    scanf("%d", &row);
    printf("Enter the number of columns: ");
    scanf("%d", &column);
    printf("Enter the number of layers: ");
    scanf("%d", &layer);

    int mat[row][column][layer];
    puts("\nInsert the numbers into the matrix:");
    for (i = 0; i < row; i++) {
        for (j = 0; j < column; j++) {
            for (k = 0; k < layer; k++) {
                scanf("%d", &number);
                mat[i][j][k] = number;
            }
        }
    }

    printf("\nEnter the number to find the position in the matrix: ");
    scanf("%d", &number);
    for (i = 0; i < row; i++) {
        for (j = 0; j < column; j++) {
            for (k = 0; k < layer; k++) {
                if (number == mat[i][j][k]) {
                    rowNumber = i;
                    columnNumber = j;
                    layerNumber = k;
                    numberFound = 1;
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
        printf("\nThe number %d is found in row %d column %d layer %d\n", number, rowNumber, columnNumber, layerNumber);
    }
    else {
        puts("\nThe number was not inserted into the matrix\n");
        return 1;
    }

    return 0;
}
