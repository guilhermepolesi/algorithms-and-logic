/*
Write a program that contains a recorded password and asks the user to enter the password until the password is valid.
Print the answer.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = "Gosling1995", passwordInput;

        System.out.print("Enter a password: ");
        passwordInput = sc.nextLine();

        while (!passwordInput.equals(password)) {
            System.out.print("\nInvalid password, enter again: ");
            passwordInput = sc.nextLine();
        }

        System.out.println("\nValid password!");
    }
}