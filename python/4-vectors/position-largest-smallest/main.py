# Write a program to insert values into a vector.
# Print the largest, smallest and their respective positions.

n = int(input("Enter the number of elements to insert: "))

vec = []
for i in range(n):
    number = int(input("\nEnter a number: "))
    vec.append(number)

largest = vec[0]
pos_largest = 0
for i in range(1, n):
    if vec[i] > largest:
        largest = vec[i]
        pos_largest = i

smallest = vec[0]
pos_smallest = 0
for i in range(1, n):
    if vec[i] < smallest:
        smallest = vec[i]
        pos_smallest = i

print(f"\nThe largest number inserted in the vector is {largest} and is in position {pos_largest}.\n\
The smallest number inserted in the vector is {smallest} and is in position {pos_smallest}.")