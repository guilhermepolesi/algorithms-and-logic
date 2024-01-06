/* Write a program that takes two integers and prints the division between them.
Use float or double for the variable and type conversion for the result.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2;
    double div;

    printf("Enter the dividend number: ");
    scanf("%d", &n1);
    printf("Enter the divisor number: ");
    scanf("%d", &n2);

    div = (double) n1 / n2;
    printf("\nDividing %d by %d is %.2lf\n", n1, n2, div);
    return 0;
}
