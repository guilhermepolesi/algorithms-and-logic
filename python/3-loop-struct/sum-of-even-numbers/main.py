# Write a program that adds all even numbers up to 100. Print the sum.

sum_ = 0

for i in range(0, 101):
    if i % 2 == 0:
        sum_ += i

print(f"The sum of even numbers is {sum_}")