/*
Write a program that asks the user how many elements he wants to insert.
Enter the numbers and check the average of the even numbers and the number of even numbers in the vector.
Print the values.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int i, n, number, count, average, sum = 0;
    printf("Enter the number of elements to insert: ");
    scanf("%d", &n);

    int vec[n];
    for (i = 0; i < n; i++) {
        printf("\nEnter a number: ");
        scanf("%d", &number);
        vec[i] = number;
    }

    for (i = 0; i < n; i++) {
        if (vec[i] % 2 == 0) {
            sum += vec[i];
            count++;
        }
    }

    average = sum / count;
    printf("\nThe average of the even numbers in the vector is %d and the number of even numbers is %d", average, count);

    return 0;
}
