// Write a program that asks the user to enter first name, age, gender, height. Print the information.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiating object in java for data entry
        Scanner sc = new Scanner(System.in);

        int age;
        char gender;
        double height;
        String name;

        System.out.print("Enter the first name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter the gender(M/F): ");
        gender = sc.next().charAt(0);
        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        System.out.printf("\nName: %s\nAge: %d\nGender: %c\nHeight: %.2f\n", name, age, gender, height);

    }
}
