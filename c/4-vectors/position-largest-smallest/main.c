// Write a program to insert values ​​into a vector. Print the largest, smallest and their respective positions.

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int i, n, number, largest, posLargest, smallest, posSmallest;
    printf("Enter the number of elements to insert: ");
    scanf("%d", &n);

    int vec[n];
    for (i = 0; i < n; i++) {
        printf("\nEnter a number: ");
        scanf("%d", &number);
        vec[i] = number;
    }

    largest = vec[0];
    posLargest = 0;
    for (i = 1; i < n; i++) {
        if (vec[i] > largest) {
            largest = vec[i];
            posLargest = i;
        }
    }

    smallest = vec[0];
    posSmallest = 0;
    for (i = 1; i < n; i++) {
        if (vec[i] < smallest) {
            smallest = vec[i];
            posSmallest = i;
        }
    }

    printf("\nThe largest number inserted in the vector is %d and is in position %d.\n"
    "The smallest number inserted in the vector is %d and is in position %d.\n", largest, posLargest, smallest, posSmallest);

    return 0;
}
