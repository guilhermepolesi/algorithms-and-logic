# Write a program that asks the user how many elements he wants to insert.
# Enter the numbers and check the average of the even numbers and the number of even numbers in the vector.
# Print the values.

n = int(input("Enter the number of elements to insert: "))

vec = []
for i in range(n):
    number = int(input("\nEnter a number: "))
    vec.append(number)

sum_ = 0
count = 0
for i in range(n):
    if vec[i] % 2 == 0:
        sum_ += vec[i]
        count += 1

if count != 0:
    average = sum_ / count
    print(f"\nThe average of the even numbers in the vector is {average:.2f} and the number of even numbers is {count}")