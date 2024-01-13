# Write a program that asks the user how many elements he wants to insert.
# Enter the number of elements and add them all up at the end. Print the result.

n = int(input("Enter the number of elements to insert: "))

vec = []
for i in range(n):
    number = int(input("\nEnter a number: "))
    vec.append(number)

sum_ = 0
for i in range(n):
    sum_ += vec[i]

print(f"\nThe sum of the elements is {sum_}")