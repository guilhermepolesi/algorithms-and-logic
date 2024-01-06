// Write a program that takes two integers and prints the sum.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiating object in java for data entry
        Scanner sc = new Scanner(System.in);

        int n1, n2, sum;

        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();

        sum = n1 + n2;
        System.out.println("\nThe sum of the numbers entered is " + sum);
    }
}
