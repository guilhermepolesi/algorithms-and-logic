/* Write a program that asks the user how many elements they want to insert.
Enter the number of elements and print them in reverse order.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, n, number;
    printf("Enter the number of elements to insert: ");
    scanf("%d", &n);

    int vec[n];
    for (i = 0; i < n; i++) {
        printf("\nEnter a number: ");
        scanf("%d", &number);
        vec[i] = number;
    }

    printf("\nReverse order:\n");
    for (i = n-1; i >= 0; i--) {
        printf("%d\n", vec[i]);
    }

    return 0;
}
