/* Write a program that prompts the user to enter three integers. Prints the largest and smallest.
If the three numbers entered are the same, the message "The numbers entered are all the same!" will be printed.
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2, n3, largest, smallest;

    printf("Enter three numbers:\n");
    scanf("%d%d%d", &n1, &n2, &n3);

    if (n1 == n2 && n1 == n3) {
        printf("\nThe numbers entered are all the same!\n");
        return 1;
    }
    else if (n1 > n2 && n1 > n3) {
        largest = n1;
        if (n2 < n3) {
            smallest = n2;
        }
        else {
            smallest = n3;
        }
    }
    else if (n2 > n3) {
        largest = n2;
        if (n1 < n3) {
            smallest = n1;
        }
        else {
            smallest = n3;
        }
    }
    else {
        largest = n3;
        if (n1 < n2) {
            smallest = n1;
        }
        else {
            smallest = n2;
        }
    }

    printf("\nThe largest number is %d and the smallest number is %d.\n", largest, smallest);

    return 0;
}
