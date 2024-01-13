/*
Write a program that asks the user the number of values ​​to insert into vectors A and B.
Insert the values ​​into the two vectors and then add them and print the values ​​and their respective positions.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int i, n, number;
    printf("Enter the size for vectors A and B: ");
    scanf("%d", &n);

    int vecA[n];
    printf("\nEnter the values ​​of vector A:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &number);
        vecA[i] = number;
    }

    int vecB[n];
    printf("\nEnter the values ​​of vector B:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &number);
        vecB[i] = number;
    }

    int sumVec[n];
    for (i = 0; i < n; i++) {
        sumVec[i] = vecA[i] + vecB[i];
    }

    printf("\nThe position and sum of the values ​​is:\n");
    for (i = 0; i < n; i++) {
        printf("Position %d = %d\n", i, sumVec[i]);
    }

    return 0;
}
