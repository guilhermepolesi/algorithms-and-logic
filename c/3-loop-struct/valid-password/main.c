/*
Write a program that contains a recorded password and asks the user to enter the password until the password is valid.
Print the answer.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{

    char password[] = "Ritchie1972", passwordInput[50];
    printf("Enter a password: ");
    fgets(passwordInput, sizeof(passwordInput), stdin);
    passwordInput[strcspn(passwordInput, "\n")] = '\0';

    while (strcmp(password, passwordInput) != 0) {
        printf("\nInvalid password, enter again: ");
        fgets(passwordInput, sizeof(passwordInput), stdin);
        passwordInput[strcspn(passwordInput, "\n")] = '\0';
    }

    printf("\nValid password!\n");

    return 0;
}
