# Write a program that contains a recorded password and asks the user to enter the password until the password is valid.
# Print the answer.

password = "Rossum1991"
passwordInput = input("Enter a password: ")

while passwordInput != password:
    passwordInput = input("\nInvalid password, enter again: ")

print("\nValid password!")