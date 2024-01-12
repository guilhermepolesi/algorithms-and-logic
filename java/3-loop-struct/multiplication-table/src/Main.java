/* Write a program that asks the user which number he wants to see in the multiplication table from 1 to 10.
Print the multiplication table.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, result;

        System.out.print("Enter the number to see the multiplication table: ");
        number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println("\n" + number + " x " + i + " = " + result);
        }
    }
}