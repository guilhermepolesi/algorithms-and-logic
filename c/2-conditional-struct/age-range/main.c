// Write a program to ask the user how old they are. Print whether he is a child, teenager, adult or elderly person.

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int age;

    printf("Enter your age: ");
    scanf("%d", &age);

        if (age >= 0 && age <= 12) {
            printf("\nYou are in the child age group.\n");
        }
        else if (age >= 13 && age <= 17) {
            printf("\nYou are in the teenage age group.\n");
        }
        else if (age >= 18 && age <= 64) {
            printf("\nYou are in the adult age group.\n");
        }
        else if (age >= 65) {
            printf("\nYou are in the elderly age group.\n");
        }
        else {
            printf("\nInvalid input!\n");
        }

    return 0;
}
