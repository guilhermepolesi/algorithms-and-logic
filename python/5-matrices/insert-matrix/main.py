# Write a program that asks the user how many rows and columns he wants to store a matrix.
# Enter numbers to fill the matrix. Print the matrix at the end according to rows and columns.

n = int(input("Enter the number of rows for the matrix: "))
m = int(input("Enter the number of columns in the matrix: "))

mat = [[0 for columns in range (m)] for rows in range(n)]
print("\nEnter the numbers to fill the matrix:")
for i in range(0, n):
    for j in range(0, m):
        number = int(input())
        mat[i][j] = number

print("\nInserted matrix:")
for i in range(0, n):
    for j in range(0, m):
        print(f"{mat[i][j]} ", end='')
    print()