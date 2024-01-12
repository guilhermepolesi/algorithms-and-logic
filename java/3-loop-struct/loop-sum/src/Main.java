/* Write a program for the user to enter numbers and add up all the numbers until the user enters 0 to end the program.
Print the total sum of the numbers entered.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, sum = 0;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("\nThe sum of the numbers entered is " + sum);

    }
}