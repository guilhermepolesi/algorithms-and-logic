#  Write a program that asks the user to enter an integer.
# Check and print on the screen whether the number is positive, negative or equal to zero.

number = int(input("Enter a number: "))

if number > 0:
    print("\nThe number is positive.")
elif number < 0:
    print("\nThe number is negative.")
else:
    print("\nThe number is equal to zero.")