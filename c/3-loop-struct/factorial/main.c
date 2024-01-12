// Write a program that asks the user for a number and calculates the factorial of that number. Print the result.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, number, factorial;

    printf("Enter a number to calculate the factorial: ");
    scanf("%d", &number);

    factorial = 1;
    for (i = number; i > 0; i--) {
        factorial *= i;
    }

    printf("\nThe factorial of the number is %d.\n", factorial);

    return 0;
}
