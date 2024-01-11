/*
Write a program that makes a simple calculator. The user will enter the first number
then enter the operator and then enter the second number.
Print the operation and the result.
This exercise must be done with numbers and results in float or double.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1, n2, result = 0;
        char operator;

        System.out.print("Enter the first number: ");
        n1 = sc.nextDouble();
        System.out.print("Enter operator: ");
        sc.nextLine();
        operator = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        n2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = n1 + n2;
                System.out.printf("\nThe operation is a sum."
                                    + "\nThe result is %.2f.\n", result);
                break;
            case '-':
                result = n1 - n2;
                System.out.printf("\nThe operation is a subtraction."
                                    + "\nThe result is %.2f.\n", result);
                break;
            case '*':
                result = n1 * n2;
                System.out.printf("\nThe operation is a multiplication."
                                    + "\nThe result is %.2f.\n", result);
                break;
            case '/':
                result = n1 / n2;
                System.out.printf("\nThe operation is a division."
                                    + "\n8The result is %.2f.\n", result);
                break;
            default:
                System.out.println("\nInvalid input!.");
        }

    }
}