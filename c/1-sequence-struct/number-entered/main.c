// Write a program that prompts for a number and displays the message "The number you entered was [number]."

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    printf("\nThe number you entered was %d.\n", number);
    return 0;
}
