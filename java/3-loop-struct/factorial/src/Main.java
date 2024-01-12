// Write a program that asks the user for a number and calculates the factorial of that number.
// Print the result.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, factorial;

        System.out.print("Enter a number to calculate the factorial: ");
        number = sc.nextInt();

        factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("\nThe factorial of the number is " + factorial);

    }
}