# Write a program that asks the user how many elements they want to insert.
# Enter the number of elements and print them in reverse order.

n = int(input("Enter the number of elements to insert: "))

vec = []
for i in range(n):
    number = int(input("\nEnter a number: "))
    vec.append(number)

print("\nReverse order:")
for i in range(n-1, -1, -1):
    print(vec[i])