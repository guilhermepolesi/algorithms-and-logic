/*
Write a program that asks the user how big square matrix A and square matrix B are.
Enter the numbers in the rows and columns.
Make the sum of the respective rows and columns of matrices A and B, and store in a matrix C.
Print the values ​​of matrix C.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int n, i, j, number;

    printf("Enter the size of the square matrices: ");
    scanf("%d", &n);

    int matA[n][n], matB[n][n], matC[n][n];

    printf("\nInsert the values into matrix A:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &number);
            matA[i][j] = number;
        }
    }

    printf("\nInsert the values into matrix B:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            scanf("%d", &number);
            matB[i][j] = number;
        }
    }

    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            matC[i][j] = matA[i][j] + matB[i][j];
        }
    }

    printf("\nSum matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            printf("%d  ", matC[i][j]);
        }
        printf("\n");
    }

    return 0;
}
