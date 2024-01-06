// Write a program that prompts for a number and displays the message "The number you entered was [number]."

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiating object in java for data entry
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        System.out.println("\nThe number you entered was " + number);

    }
}
