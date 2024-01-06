// Write a program that takes two integers and prints the sum.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2, sum;

    printf("Enter the first number: ");
    scanf("%d", &n1);
    printf("Enter the second number: ");
    scanf("%d", &n2);

    sum = n1 + n2;

    printf("\nThe sum of the numbers entered is %d.\n", sum);
    return 0;
}
