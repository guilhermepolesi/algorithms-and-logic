/* Write a program that asks the user how many elements he wants to insert.
Enter the number of elements and add them all up at the end. Print the result.
*/


#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, n, number, sum = 0;
    printf("Enter the number of elements to insert: ");
    scanf("%d", &n);

    int vec[n];
    for (i = 0; i < n; i++) {
        printf("\nEnter a number: ");
        scanf("%d", &number);
        vec[i] = number;
    }

    for (i = 0; i < n; i++) {
        sum += vec[i];
    }

    printf("\nThe sum of the elements is %d\n", sum);

    return 0;
}
