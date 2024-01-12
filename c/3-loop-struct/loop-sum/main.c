/* Write a program for the user to enter numbers and add up all the numbers until the user enters 0 to end the program.
Print the total sum of the numbers entered.
*/

#include <stdio.h>
#include <stdlib.h>


int main()
{
    int number, sum = 0;

    do {
        printf("Enter a number: ");
        scanf("%d", &number);
        sum += number;
    } while (number != 0);

    printf("\nThe sum of the numbers entered is %d.\n", sum);


    return 0;
}
