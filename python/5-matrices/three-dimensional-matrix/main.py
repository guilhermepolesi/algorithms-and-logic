# Write a program that creates a three-dimensional matrix. Ask the user to enter row, column, and layer values.
# Enter numbers to fill the matrix.
# Ask the user which number he wants to find the position in the matrix.
# Print the row, column and layer where the number is located.
# In this program, if there are duplicate numbers in the matrix
# the row, column and layer in which the number appeared first will be pointed out.

row = int(input("Enter the number of rows: "))
column = int(input("Enter the number of columns: "))
layer = int(input("Enter the number of layers: "))

mat = [[[0 for layers in range(layer)] for columns in range(column)] for rows in range(row)]

print("\nInsert the numbers into the matrix:")
for i in range(0, row):
    for j in range(0, column):
        for k in range(0, layer):
            number = int(input())
            mat[i][j][k] = number

number_found = False
row_number = 0
column_number = 0
layer_number = 0
print("\nEnter the number to find the position in the matrix: ")
number = int(input())
for i in range(0, row):
    for j in range(0, column):
        for k in range(0, layer):
            if number == mat[i][j][k]:
                row_number = i
                column_number = j
                layer_number = k
                number_found = True
                break
        if number_found:
            break
    if number_found:
        break

if number_found:
    print(f"\nThe number {number} is found in row {row_number} column {column_number} layer {layer_number}")
else:
    print("\nThe number was not inserted into the matrix")