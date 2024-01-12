# Write a program that asks the user for a number and calculates the factorial of that number. Print the result.

number = int(input("Enter a number to calculate the factorial: "))

factorial = 1
for i in range(number, 0, -1):
    factorial *= i

print(f"\nThe factorial of the number is {factorial}")