// Write a program that asks the user to enter a number and prints whether it is even or odd.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number;

    printf("Enter a number: ");
    scanf("%d", &number);

    if (number % 2 == 0) {
        printf("\nThe number entered is even.\n");
    }
    else {
        printf("\nThe number entered is odd.\n");
    }

    return 0;
}
