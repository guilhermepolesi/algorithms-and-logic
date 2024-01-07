// Write a program that asks the user to enter first name, age, gender, height. Print the information.

#include <stdio.h>
#include <stdlib.h>

/* Function to clear the input buffer, due to possible problems reading entire data after text input,
where the line break is left in the buffer, affecting the next read.*/ 
void clearBuffer() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

int main()
{
    int age;
    char name[20], gender;
    double height;

    printf("Enter first name: ");
    scanf("%s", name);
    printf("Enter age: ");
    scanf("%d", &age);
    printf("Enter the gender(M/F): ");
    clearBuffer();
    scanf("%c", &gender);
    printf("Enter the height: ");
    scanf("%lf", &height);

    printf("\nName: %s\nAge: %d\nGender: %c\nHeight: %.2lf\n", name, age, gender, height);
    return 0;
}
