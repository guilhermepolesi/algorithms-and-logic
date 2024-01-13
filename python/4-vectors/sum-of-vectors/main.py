# Write a program that asks the user the number of values to insert into vectors A and B.
# Insert the values into the two vectors and then add them and print the values and their respective positions.

n = int(input("Enter the size for vectors A and B: "))

vec_A = []
print("\nEnter the values of vector A:")
for i in range(n):
    number = int(input())
    vec_A.append(number)

vec_B = []
print("\nEnter the values of vector B:")
for i in range(n):
    number = int(input())
    vec_B.append(number)

sum_vec = []
for i in range(n):
    sum_vec.append(vec_A[i] + vec_B[i])

print("\nThe position and sum of the values is:\n")
for i in range(n):
    print(f"Position {i} = {sum_vec[i]}\n")