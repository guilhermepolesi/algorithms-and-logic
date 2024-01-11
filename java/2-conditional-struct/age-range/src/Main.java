// Write a program to ask the user how old they are. Print whether he is a child, teenager, adult or elderly person.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("\nYou are in the child age group.");
        }
        else if (age >= 13 && age <= 17) {
            System.out.println("\nYou are in the teenage age group.");
        }
        else if (age >= 18 && age <= 64) {
            System.out.println("\nYou are in the adult age group.");
        }
        else if (age >= 65) {
            System.out.println("\nYou are in the elderly age group.");
        }
        else {
            System.out.println("\nInvalid input!");
        }

    }
}