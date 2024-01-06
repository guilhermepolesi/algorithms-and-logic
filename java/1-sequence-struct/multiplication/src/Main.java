// Write a program that asks for two integers and prints the multiplication.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiating object in java for data entry
        Scanner sc = new Scanner(System.in);

        int n1, n2, mul;

        System.out.print("Enter the number to be multiplied: ");
        n1 = sc.nextInt();
        System.out.print("Enter the multiplier number: ");
        n2 = sc.nextInt();

        mul = n1 * n2;
        System.out.println("\nMultiplication of the entered numbers is " + mul);


    }
}
