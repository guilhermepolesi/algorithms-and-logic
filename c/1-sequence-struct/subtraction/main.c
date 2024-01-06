// Write a program that asks for two integers and prints the subtraction.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2, sub;

    printf("Enter the first number: ");
    scanf("%d", &n1);
    printf("Enter the second number: ");
    scanf("%d", &n2);

    sub = n1 - n2;
    printf("\nSubtraction of the entered numbers is %d.\n", sub);
    return 0;
}
