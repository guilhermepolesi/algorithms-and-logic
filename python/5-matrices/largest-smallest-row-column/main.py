# Write a program that creates a 4x4 matrix and asks the user to enter numbers.
# Find the largest and smallest element in the matrix.
# Print the values and in which row and column the respective values are found.
# In this program, if there are duplicate numbers in the matrix
# the row and column in which the number appeared first will be pointed out.

mat = [[0 for columns in range(4)] for rows in range(4)]

print("Enter matrix numbers:")
for i in range(0, 4):
    for j in range(0, 4):
        number = int(input())
        mat[i][j] = number

largest = mat[0][0]
row_largest = 0
column_largest = 0
for i in range(0, 4):
    for j in range(0, 4):
        if mat[i][j] > largest:
            largest = mat[i][j]
            row_largest = i
            column_largest = j

smallest = mat[0][0]
row_smallest = 0
column_smallest = 0
for i in range(0, 4):
    for j in range(0, 4):
        if mat[i][j] < smallest:
            smallest = mat[i][j]
            row_smallest = i
            column_smallest = j

print(f"The largest value in the matrix is {largest}, and is found in row {row_largest} column {column_largest}")
print(f"The smallest value in the matrix is {smallest}, and is found in row {row_smallest} column {column_smallest}")