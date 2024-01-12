# Write a program that asks the user which number he wants to see in the multiplication table from 1 to 10.
# Print the multiplication table.

number = int(input("Enter the number to see the multiplication table: "))

for i in range(1,11):
    result = number * i
    print(f"\n{number} x {i} = {result}")