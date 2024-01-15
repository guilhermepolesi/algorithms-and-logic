# Write a program that creates a 4x4 matrix, and asks the user to enter numbers.
# Print the values that are above the main diagonal.

mat = [[0 for columns in range (4)] for rows in range(4)]
print("Enter matrix numbers:")
for i in range(0, 4):
    for j in range(0, 4):
        mat[i][j] = int(input())

print("\nAbove main diagonal:")
for i in range(0, 4):
    for j in range(0, 4):
        if j > i:
            print(f"{mat[i][j]} ", end='')
        else:
            print("  ", end='')
    print()