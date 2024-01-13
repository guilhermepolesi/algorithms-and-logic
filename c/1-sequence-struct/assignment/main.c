/*
Write a program that directly assigns variables. Assign the main types (string, integer, character, floating-point and logical.
Enter your name, age, gender and height.
The logical value is determined false if the age is less than 40, and true for greater than 40.
Print the information.
*/

// Preprocessing, library inclusion
#include <stdio.h>

// Main function to run a C program
int main()
{ // Opening the brace "{" indicates that everything that comes after it is within the main() function

    // Strings in C are declared as character vectors
    char name[] = "Ada";

    // Declaration of integers in C
    int age = 36;

    // Character declaration in C
    char gender = 'F';

    // Double precision floating point declaration. The "float" type is used for single precision
    double height = 1.72;

    // Logical value in C language, 0 represents false and any number other than 0 (n != 0) is true
    int logical = 0;

    /*
    Function that contains the "stdio.h" library, which was declared in preprocessing at the beginning of the program.
    Use the markers %s for string, %d for decimal integer, %c for character, %lf for double (enter the number of decimal places, example: %.1lf prints 1.0).
    The "\n" is used to jump to the line below.
    Place the variables after the text according to the hierarchy of markers and their types to avoid problems with errors.
    */
    printf("Name: %s\nAge: %d\nGender: %c\nHeight: %.2lf\nLogical value: %d\n", name, age, gender, height, logical);

    /*
    Return is a keyword in C, in this situation it is recommended to be used at the end of the program
    So if the program runs to the end and reaches this line, it will mean that "returned 0 errors to the main() function"
    */
    return 0;
} // Closing this brace "}" indicates the end of the main() function
