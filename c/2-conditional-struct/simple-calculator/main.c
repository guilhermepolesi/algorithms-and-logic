/*
Write a program that makes a simple calculator. The user will enter the first number
then enter the operator and then enter the second number.
Print the operation and the result.
This exercise must be done with numbers and results in float or double.
*/

#include <stdio.h>
#include <stdlib.h>

void clearBuffer() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

int main()
{
    double n1, n2, result;
    char operator_;

    printf("Enter the first number: ");
    scanf("%lf", &n1);
    printf("Enter operator: ");
    clearBuffer();
    scanf("%c", &operator_);
    printf("Enter the second number: ");
    scanf("%lf", &n2);

    switch (operator_) {
        case '+':
            result = n1 + n2;
            printf("\nThe operation is a sum.\nThe result is %.2lf.\n", result);
            break;
        case '-':
            result = n1 - n2;
            printf("\nThe operation is a subtraction.\nThe result is %.2lf\n", result);
            break;
        case '*':
            result = n1 * n2;
            printf("\nThe operation is a multiplication.\nThe result is %.2lf\n", result);
            break;
        case '/':
            result = n1 / n2;
            printf("\nThe operation is a division.\nThe result is %.2lf\n", result);
            break;
        default:
            printf("\nInvalid input!\n");
    }

    return 0;
}
