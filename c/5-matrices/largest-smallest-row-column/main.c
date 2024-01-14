/*
Write a program that creates a 4x4 matrix and asks the user to enter numbers.
Find the largest and smallest element in the matrix.
Print the values ​​and in which row and column the respective values ​​are found.
In this program, if there are duplicate numbers in the matrix, the row and column in which the number appeared first will be pointed out.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int mat[4][4], i, j, number, largest, rowLargest, columnLargest, smallest, rowSmallest, columnSmallest;

    printf("Enter matrix numbers:\n");
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            scanf("%d", &number);
            mat[i][j] = number;
        }
    }

    largest = mat[0][0];
    rowLargest = 0;
    columnLargest = 0;
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            if (mat[i][j] > largest) {
                largest = mat[i][j];
                rowLargest = i;
                columnLargest = j;
            }
        }
    }

    smallest = mat[0][0];
    rowSmallest = 0;
    columnSmallest = 0;
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            if (mat[i][j] < smallest) {
                smallest = mat[i][j];
                rowSmallest = i;
                columnSmallest = j;
            }
        }
    }

    printf("\nThe largest value in the matrix is ​​%d, and is found in row %d column %d\n", largest, rowLargest, columnLargest);
    printf("\nThe smallest value in the matrix is ​​%d, and is found in row %d column %d\n", smallest, rowSmallest, columnSmallest);

    return 0;
}
