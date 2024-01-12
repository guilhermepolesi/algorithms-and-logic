/* Write a program that asks the user which number he wants to see in the multiplication table from 1 to 10.
Print the multiplication table.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, number, result;

    printf("Enter the number to see the multiplication table: ");
    scanf("%d", &number);

    for (i = 1; i <= 10; i++) {
        result = number * i;
        printf("\n%d x %d = %d \n", number, i, result);
    }

    return 0;
}
