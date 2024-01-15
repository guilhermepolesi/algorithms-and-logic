# Write a program that asks the user how big square matrix A and square matrix B are.
# Enter the numbers in the rows and columns.
# Make the sum of the respective rows and columns of matrices A and B, and store in a matrix C.
# Print the values of matrix C.

n = int(input("Enter the size of the square matrices: "))

mat_A = [[0 for columns in range(n)] for rows in range(n)]
mat_B = [[0 for columns in range(n)] for rows in range(n)]
mat_C = [[0 for columns in range(n)] for rows in range(n)]

print("\nInsert the values into matrix A:")
for i in range(0, n):
    for j in range(0, n):
        number = int(input())
        mat_A[i][j] = number

print("\nInsert the values into matrix B:")
for i in range(0, n):
    for j in range(0, n):
        number = int(input())
        mat_B[i][j] = number

for i in range(0, n):
    for j in range(0, n):
        mat_C[i][j] = mat_A[i][j] + mat_B[i][j]

print("\nSum matrix:")
for i in range(0, n):
    for j in range(0, n):
        print(f"{mat_C[i][j]} ", end='')
    print()