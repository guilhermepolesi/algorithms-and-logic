// Write a program that asks for two integers and prints the subtraction.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiating object in java for data entry
        Scanner sc = new Scanner(System.in);

        int n1, n2, sub;

        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();

        sub = n1 - n2;
        System.out.println("\nSubtraction of the entered numbers is " + sub);
    }
}
