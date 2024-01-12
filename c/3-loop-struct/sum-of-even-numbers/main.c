// Write a program that adds all even numbers up to 100. Print the sum.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, sum;

    for (i = 0; i <= 100; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }

    printf("The sum of even numbers is %d.\n", sum);

    return 0;
}
