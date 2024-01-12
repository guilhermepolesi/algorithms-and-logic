# Write a program for the user to enter numbers and add up all the numbers until the user enters 0 to end the program.
# Print the total sum of the numbers entered.

number = int(input("Enter a number: "))

sum_ = 0
while number != 0:
    sum_ += number
    number = int(input("Enter a number: "))

print(f"\nThe sum of the numbers entered is {sum_}")

