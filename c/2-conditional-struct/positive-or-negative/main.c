/* Write a program that asks the user to enter an integer.
Check and print on the screen whether the number is positive, negative or equal to zero.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    if (number > 0) {
        puts("\nThe number is positive.");
    }
    else if (number < 0) {
        puts("\nThe number is negative.");
    }
    else {
        puts("\nThe number is equal to zero.");
    }

    return 0;
}
