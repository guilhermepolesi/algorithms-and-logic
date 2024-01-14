/*
Write a program that asks the user how many rows and columns he wants to store a matrix.
Enter numbers to fill the matrix. Print the matrix at the end according to rows and columns.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, m, i, j, number;

    printf("Enter the number of rows for the matrix: ");
    scanf("%d", &n);
    printf("Enter the number of columns in the matrix: ");
    scanf("%d", &m);

    int mat[n][m];
    printf("\nEnter numbers to fill the matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
            scanf("%d", &number);
            mat[i][j] = number;
        }
    }

    printf("\nInserted matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
            printf("%d  ", mat[i][j]);
        }
        printf("\n");
    }

    return 0;
}
