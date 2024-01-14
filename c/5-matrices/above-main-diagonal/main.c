/*
Write a program that creates a 4x4 matrix, and asks the user to enter numbers.
Print the values ​​that are above the main diagonal.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int mat[4][4], i, j, number;

    printf("Enter matrix numbers:\n");
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            scanf("%d", &number);
            mat[i][j] = number;
        }
    }

    for (i = 0; i < 4; i++) {
        for (j = 0; j < 4; j++) {
            if (j > i) {
                printf("%d  ", mat[i][j]);
            }
            else {
                printf("    ");
            }
        }
        printf("\n");
    }

    return 0;
}
