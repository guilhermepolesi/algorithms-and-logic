// Write a program that asks for two integers and prints the multiplication.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2, mul;

    printf("Enter the number to be multiplied: ");
    scanf("%d", &n1);
    printf("Enter the multiplier number: ");
    scanf("%d", &n2);

    mul = n1 * n2;
    printf("\nMultiplication of the entered numbers is %d.\n", mul);
    return 0;
}
