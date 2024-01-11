// Write a program that asks the user to enter a number and prints whether it is even or odd.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("\nThe number entered is even.");
        }
        else {
            System.out.println("\nThe number entered is odd.");
        }
    }
}