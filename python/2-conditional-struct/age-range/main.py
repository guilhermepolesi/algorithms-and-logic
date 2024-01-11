# Write a program to ask the user how old they are. Print whether he is a child, teenager, adult or elderly person.

age = int(input("Enter yout age: "))

if age >= 0 and age <= 12:
    print("\nYou are in the child age group.\n")
elif age >= 13 and age <= 17:
    print("\nYou are in the teenage age group.\n")
elif age >= 18 and age <= 64:
    print("\nYou are in the adult age group.\n")
elif age >= 65:
    print("\nYou are in the elderly age group.\n")
else:
    print("\nInvalid input!\n")