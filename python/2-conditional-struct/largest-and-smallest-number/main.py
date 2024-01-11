# Write a program that prompts the user to enter three integers. Prints the largest and smallest.
# If the three numbers entered are the same, the message "The numbers entered are all the same!" will be printed.

print("Enter three numbers:")
n1 = int(input())
n2 = int(input())
n3 = int(input())

if n1 == n2 and n1 == n3:
    print("\nThe numbers entered are all the same!\n")
elif n1 > n2 and n1 > n3:
    largest = n1
    if n2 < n3:
        smallest = n2
    else:
        smallest = n3
elif n2 > n3:
    largest = n2
    if n1 < n3:
        smallest = n1
    else:
        smallest = n3
else:
    largest = n3
    if n1 < n2:
        smallest = n1
    else:
        smallest = n2

print(f"\nThe largest number is {largest} and the smallest number is {smallest}.")