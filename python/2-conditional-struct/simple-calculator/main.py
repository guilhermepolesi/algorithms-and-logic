# Write a program that makes a simple calculator. The user will enter the first number
# then enter the operator and then enter the second number.
# Print the operation and the result.
# This exercise must be done with numbers and results in float or double.

n1 = float(input("Enter the first number: "))
operator = input("Enter the operator: ")
n2 = float(input("Enter the second number: "))

if operator == '+':
    result = n1 + n2
    print(f"\nThe operation is a sum.\nThe result is {result:.2f}")
elif operator == '-':
    result = n1 - n2
    print(f"\nThe operation is a subtraction.\nThe result is {result:.2f}")
elif operator == '*':
    result = n1 * n2
    print(f"\nThe operation is a multiplication.\nThe result is {result:.2f}")
elif operator == '/':
    result = n1 / n2
    print(f"\nThe operation is a division.\nThe result is {result:.2f}")
else:
    print("\nInvalid input!")